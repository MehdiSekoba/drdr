package com.mehdisekoba.drdr.ui.turns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.data.model.turn.dataTurnList
import com.mehdisekoba.drdr.databinding.FragmentAllTurnsBinding
import com.mehdisekoba.drdr.ui.turns.adapter.AdapterVerbal
import com.mehdisekoba.drdr.utils.base.BaseFragment
import com.mehdisekoba.drdr.utils.extensions.setupRecyclerview
import com.mehdisekoba.drdr.utils.extensions.showCustomSnackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class AllTurnsFragment : BaseFragment<FragmentAllTurnsBinding>() {
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentAllTurnsBinding
        get() = FragmentAllTurnsBinding::inflate

    @Inject
    lateinit var adapter: AdapterVerbal

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            if (isNetworkAvailable) {
                lifecycleScope.launch {
                    turnList.isVisible=false
                    delay(3000)
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