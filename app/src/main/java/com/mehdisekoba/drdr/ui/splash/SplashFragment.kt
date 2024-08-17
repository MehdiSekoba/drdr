package com.mehdisekoba.drdr.ui.splash

import android.animation.Animator
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.mehdisekoba.drdr.BuildConfig
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.databinding.FragmentSplashBinding
import com.mehdisekoba.drdr.utils.base.BaseFragment
import com.mehdisekoba.drdr.utils.extensions.showCustomSnackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding>() {
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentSplashBinding
        get() = FragmentSplashBinding::inflate


    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //init
        binding.apply {
            if (isNetworkAvailable) {
                lifecycleScope.launch {
                    handleAnimation()
                    //version
                    txtVersion.text = "${getString(R.string.version)} ${BuildConfig.VERSION_NAME}"
                    delay(3500)
                    findNavController().popBackStack(R.id.splashFragment, true)
                    findNavController().navigate(R.id.action_splash_to_home)
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

    private fun handleAnimation() {
        binding.animationView.apply {
            addAnimatorListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator) {
                }

                override fun onAnimationEnd(animation: Animator) {
                    lifecycleScope.launch {
                        delay(500)
                        playAnimation()
                    }
                }

                override fun onAnimationCancel(animation: Animator) {
                }

                override fun onAnimationRepeat(animation: Animator) {
                }

            })
        }
    }


}