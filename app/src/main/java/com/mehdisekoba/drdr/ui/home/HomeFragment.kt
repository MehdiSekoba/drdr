package com.mehdisekoba.drdr.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.data.model.home.dataSearchList
import com.mehdisekoba.drdr.databinding.FragmentHomeBinding
import com.mehdisekoba.drdr.ui.home.adapter.AdapterClinicVisit
import com.mehdisekoba.drdr.ui.home.adapter.AdapterComment
import com.mehdisekoba.drdr.ui.home.adapter.AdapterIntroduction
import com.mehdisekoba.drdr.ui.home.adapter.AdapterSearch
import com.mehdisekoba.drdr.ui.home.adapter.AdapterUrgentVisit
import com.mehdisekoba.drdr.utils.base.BaseFragment
import com.mehdisekoba.drdr.utils.extensions.setCustomizeDrawables
import com.mehdisekoba.drdr.utils.extensions.setupRecyclerview
import com.mehdisekoba.drdr.utils.extensions.showCustomSnackbar
import com.mehdisekoba.drdr.utils.extensions.toggleVisibility
import com.mehdisekoba.drdr.utils.network.NetworkRequest
import com.mehdisekoba.drdr.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    @Inject
    lateinit var search: AdapterSearch

    @Inject
    lateinit var urgentVisit: AdapterUrgentVisit

    @Inject
    lateinit var introduction: AdapterIntroduction

    @Inject
    lateinit var adapterClinic: AdapterClinicVisit

    @Inject
    lateinit var adapterComment: AdapterComment

    //other
    private val viewModel by viewModels<HomeViewModel>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            if (isNetworkAvailable) {
                lifecycleScope.launch {
                    headLay.visibility = View.INVISIBLE
                    shimmerViewHead.toggleVisibility(true)
                    delay(1000)
                    shimmerViewHead.toggleVisibility(false)
                    headLay.visibility = View.VISIBLE
                }
                searchFrequentList()
                urgentVisitDoctors()
                introductionVisitDoctors()
                clinicVisitDoctors()
                commentVisitDoctors()
                txtLocation.setCustomizeDrawables(
                    startDrawableRes = R.drawable.location_tick,
                    size = 44
                )
            } else {
                root.showCustomSnackbar(
                    message = getString(R.string.txt_action),
                    actionText = getString(R.string.Retry),
                    action = {
                        requireActivity().recreate()
                    })
            }
        }
    }

    private fun searchFrequentList() {
        binding.apply {
            if (searchLay.parent != null) {
                val searchInflate = searchLay.inflate()
                val title = searchInflate.findViewById<TextView>(R.id.frequent_searches_title)
                searchInflate.findViewById<ShimmerFrameLayout>(R.id.shimmer_view).apply {
                    lifecycleScope.launch {
                        title.isVisible = false
                        startShimmer()
                        delay(1500)
                        hideShimmer()
                        isVisible = false
                        title.isVisible = true
                        searchInflate.findViewById<RecyclerView>(R.id.search_list).apply {
                            search.setData(dataSearchList)

                            setupRecyclerview(
                                LinearLayoutManager(
                                    requireContext(),
                                    LinearLayoutManager.HORIZONTAL,
                                    false
                                ), search
                            )
                        }

                    }
                }

            }
        }

    }

    private fun urgentVisitDoctors() {
        binding.urgentLay.let { urgentLay ->
            if (urgentLay.parent != null) {
                val urgentVisitInflate = urgentLay.inflate()
                val title = urgentVisitInflate.findViewById<TextView>(R.id.urgent_title)
                val description = urgentVisitInflate.findViewById<TextView>(R.id.urgent_desc)
                val show = urgentVisitInflate.findViewById<TextView>(R.id.show_urgent_title)
                val listData = urgentVisitInflate.findViewById<RecyclerView>(R.id.urgent_list)
                val shimmer = urgentVisitInflate.findViewById<ShimmerFrameLayout>(R.id.shimmer_view)
                observeData(
                    viewModel.visitToTheDoctor,
                    title = title,
                    description = description,
                    show = show,
                    listData = listData,
                    shimmer
                ) { data ->
                    urgentVisit.setData(data.result!!.doctors!!)
                    listData.setupRecyclerview(
                        LinearLayoutManager(
                            requireContext(),
                            LinearLayoutManager.HORIZONTAL,
                            false
                        ), urgentVisit
                    )
                }
            }
        }
    }

    private fun introductionVisitDoctors() {
        binding.introductionLay.let { introductionLay ->
            if (introductionLay.parent != null) {
                val introductionVisitInflate = introductionLay.inflate()
                val title = introductionVisitInflate.findViewById<TextView>(R.id.introduction_title)
                val show =
                    introductionVisitInflate.findViewById<TextView>(R.id.show_introduction_title)
                val description =
                    introductionVisitInflate.findViewById<TextView>(R.id.introduction_desc)
                val listData =
                    introductionVisitInflate.findViewById<RecyclerView>(R.id.introduction_list)
                val shimmer =
                    introductionVisitInflate.findViewById<ShimmerFrameLayout>(R.id.shimmer_view)

                observeData(
                    viewModel.introductionDoctor,
                    title,
                    description,
                    show,
                    listData,
                    shimmer
                ) { data ->
                    introduction.setData(
                        data.result!!.doctors!!,
                        data.result.schedules!!
                    )
                    listData.setupRecyclerview(
                        LinearLayoutManager(
                            requireContext(),
                            LinearLayoutManager.HORIZONTAL,
                            false
                        ), introduction
                    )
                }
            }
        }
    }

    private fun clinicVisitDoctors() {
        binding.clinicLay.let { clinicLay ->
            if (clinicLay.parent != null) {
                val clinicVisitInflate = clinicLay.inflate()
                val title = clinicVisitInflate.findViewById<TextView>(R.id.clinic_title)
                val show = clinicVisitInflate.findViewById<TextView>(R.id.show_clinic_title)
                val description = clinicVisitInflate.findViewById<TextView>(R.id.clinic_desc)
                val listData = clinicVisitInflate.findViewById<RecyclerView>(R.id.clinic_list)
                val shimmer = clinicVisitInflate.findViewById<ShimmerFrameLayout>(R.id.shimmer_view)
                observeData(
                    viewModel.clinicData,
                    title,
                    description,
                    show,
                    listData,
                    shimmer
                ) { data ->
                    adapterClinic.setData(data.result?.clinics!!)
                    listData.setupRecyclerview(
                        LinearLayoutManager(
                            requireContext(),
                            LinearLayoutManager.HORIZONTAL,
                            false
                        ), adapterClinic
                    )
                }
            }
        }
    }

    private fun commentVisitDoctors() {
        binding.commentLay.let { commentLay ->
            if (commentLay.parent != null) {
                val commentVisitInflate = commentLay.inflate()
                val title = commentVisitInflate.findViewById<TextView>(R.id.comment_title)
                val description = commentVisitInflate.findViewById<TextView>(R.id.comment_desc)
                val listData = commentVisitInflate.findViewById<RecyclerView>(R.id.comment_list)
                val shimmer =
                    commentVisitInflate.findViewById<ShimmerFrameLayout>(R.id.shimmer_view)
                observeData(
                    viewModel.commentData,
                    title,
                    description,
                    null,
                    listData,
                    shimmer
                ) { data ->
                    adapterComment.setData(data.result!!.reviews!!)
                    listData.setupRecyclerview(
                        LinearLayoutManager(
                            requireContext(),
                            LinearLayoutManager.HORIZONTAL,
                            false
                        ), adapterComment
                    )
                }


            }
        }
    }

    private fun <T> observeData(
        viewModelLiveData: LiveData<NetworkRequest<T>>,
        title: TextView,
        description: TextView,
        show: TextView? = null,
        listData: RecyclerView,
        shimmer: ShimmerFrameLayout,
        onDataReceived: (T) -> Unit
    ) {
        viewModelLiveData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is NetworkRequest.Loading -> {
                    shimmer.toggleVisibility(true)
                    toggleViewVisibility(title, description, show, false)
                }

                is NetworkRequest.Success -> {
                    shimmer.toggleVisibility(false)
                    toggleViewVisibility(title, description, show, isShownLoading = true)

                    response.data?.let {
                        onDataReceived(it)
                    }
                }

                is NetworkRequest.Error -> {
                    shimmer.toggleVisibility(false)
                    toggleViewVisibility(title, description, show, false)
                }
            }
        }
    }


    private fun toggleViewVisibility(
        title: TextView,
        description: TextView,
        show: TextView?,
        isShownLoading: Boolean
    ) {
        title.visibility = if (isShownLoading) View.VISIBLE else View.GONE
        description.visibility = if (isShownLoading) View.VISIBLE else View.GONE
        show?.visibility = if (isShownLoading) View.VISIBLE else View.GONE
    }

}

