package com.mehdisekoba.drdr.ui.turns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.data.model.turn.dataTurnList
import com.mehdisekoba.drdr.databinding.FragmentVerbalBinding
import com.mehdisekoba.drdr.ui.turns.adapter.AdapterVerbal
import com.mehdisekoba.drdr.utils.base.BaseFragment
import com.mehdisekoba.drdr.utils.extensions.setupRecyclerview
import com.mehdisekoba.drdr.utils.extensions.showCustomSnackbar
import com.mehdisekoba.drdr.utils.extensions.toggleVisibility
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class VerbalFragment : BaseFragment<FragmentVerbalBinding>() {
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentVerbalBinding
        get() = FragmentVerbalBinding::inflate

    @Inject
    lateinit var adapter: AdapterVerbal

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            if (isNetworkAvailable) {
                lifecycleScope.launch {
                    shimmerView.toggleVisibility(true)
                    turnList.isVisible=false
                    delay(3000)
                    shimmerView.toggleVisibility(false)
                    turnList.isVisible=true
                }
                adapter.setData(dataTurnList)
                turnList.setupRecyclerview(LinearLayoutManager(requireContext()), adapter)
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


}