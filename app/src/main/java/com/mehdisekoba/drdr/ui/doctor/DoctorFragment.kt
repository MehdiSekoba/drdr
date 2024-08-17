package com.mehdisekoba.drdr.ui.doctor

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.data.model.expertise.ResponseExpertise
import com.mehdisekoba.drdr.data.model.expertise.expertise
import com.mehdisekoba.drdr.databinding.FragmentDoctorBinding
import com.mehdisekoba.drdr.ui.doctor.adapter.AdapterExpertise
import com.mehdisekoba.drdr.utils.base.BaseFragment
import com.mehdisekoba.drdr.utils.extensions.setupRecyclerview
import com.mehdisekoba.drdr.utils.extensions.showCustomSnackbar
import com.mehdisekoba.drdr.utils.extensions.toggleVisibility
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class DoctorFragment : BaseFragment<FragmentDoctorBinding>() {
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentDoctorBinding
        get() = FragmentDoctorBinding::inflate

    @Inject
    lateinit var adapter: AdapterExpertise

    //other

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            if (isNetworkAvailable) {
                lifecycleScope.launch {
                    veilLayout.veil()
                    shimmerView.toggleVisibility(true)
                    delay(2000)
                    veilLayout.unVeil()
                    shimmerView.toggleVisibility(false)
                    loadDoctorExpertise()
                }
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

    private fun loadDoctorExpertise() {
        adapter.setData(expertise)
        binding.expertiseList.setupRecyclerview(LinearLayoutManager(requireContext()), adapter)
    }

}