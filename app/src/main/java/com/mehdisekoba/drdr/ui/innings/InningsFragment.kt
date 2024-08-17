package com.mehdisekoba.drdr.ui.innings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.databinding.FragmentInningsBinding
import com.mehdisekoba.drdr.ui.innings.adapter.PagerAdapter
import com.mehdisekoba.drdr.utils.base.BaseFragment
import com.mehdisekoba.drdr.utils.extensions.showCustomSnackbar
import com.mehdisekoba.drdr.utils.extensions.toggleVisibility
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class InningsFragment : BaseFragment<FragmentInningsBinding>() {
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentInningsBinding
        get() = FragmentInningsBinding::inflate

    @Inject
    lateinit var pagerAdapter: PagerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            if (isNetworkAvailable) {
                lifecycleScope.launch {
                    veilLayout.veil()
                    shimmerView.toggleVisibility(true)
                    tabLay.isVisible=false
                    delay(3000)
                    veilLayout.unVeil()
                    shimmerView.toggleVisibility(false)
                    tabLay.isVisible=true
                }
                setupViewPager()
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

    private fun setupViewPager() {
        binding.apply {
            inningsTabLayout.addTab(inningsTabLayout.newTab().setText(R.string.all_txt))
            inningsTabLayout.addTab(
                inningsTabLayout.newTab().setIcon(R.drawable.ic_hospital)
                    .setText(R.string.txt_verbal)
            )
            inningsTabLayout.addTab(
                inningsTabLayout.newTab().setIcon(R.drawable.ic_phone).setText(R.string.txt_phone)
            )
            inningsTabLayout.addTab(
                inningsTabLayout.newTab().setIcon(R.drawable.messages).setText(R.string.txt_chat)
            )
            // View pager adapter
            inningsViewPager.adapter = pagerAdapter
            // Select
            inningsTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    if (tab != null) inningsViewPager.currentItem = tab.position
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                }

            })
            // View pager
            inningsViewPager.registerOnPageChangeCallback(
                object : ViewPager2.OnPageChangeCallback() {
                    override fun onPageSelected(position: Int) {
                        super.onPageSelected(position)
                        inningsTabLayout.selectTab(inningsTabLayout.getTabAt(position))
                    }
                },
            )
            // Disable swipe
            inningsViewPager.isUserInputEnabled = false

        }

    }

}