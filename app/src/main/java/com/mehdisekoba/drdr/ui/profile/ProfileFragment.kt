package com.mehdisekoba.drdr.ui.profile

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.databinding.FragmentProfileBinding
import com.mehdisekoba.drdr.utils.base.BaseFragment
import com.mehdisekoba.drdr.utils.extensions.setCustomizeDrawables
import com.mehdisekoba.drdr.utils.extensions.showCustomSnackbar
import com.mehdisekoba.drdr.utils.extensions.toggleVisibility
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileBinding>() {
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentProfileBinding
        get() = FragmentProfileBinding::inflate
    private var name = ""
    private var lastName = ""

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            if (isNetworkAvailable) {
                lifecycleScope.launch {
                    constraint.isVisible = false
                    shimmerView.toggleVisibility(true)
                    delay(3000)
                    shimmerView.toggleVisibility(false)
                    constraint.isVisible = true
                }
                name = "مهدی"
                lastName = "سِکوبا"
                val firstCharName = name.firstOrNull()?.toString() ?: ""
                val firstCharLastName = lastName.firstOrNull()?.toString() ?: ""
                txtUserName.text = "$firstCharName . $firstCharLastName"
                //turn
                txtTurns.setOnClickListener {
                    val direction = ProfileFragmentDirections.actionProfileFToInnings()
                    findNavController().navigate(direction)
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


}