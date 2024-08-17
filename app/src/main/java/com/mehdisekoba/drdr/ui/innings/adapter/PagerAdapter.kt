package com.mehdisekoba.drdr.ui.innings.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mehdisekoba.drdr.ui.turns.AllTurnsFragment
import com.mehdisekoba.drdr.ui.turns.ChatFragment
import com.mehdisekoba.drdr.ui.turns.PhoneFragment
import com.mehdisekoba.drdr.ui.turns.VerbalFragment

class PagerAdapter(manager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(manager, lifecycle) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AllTurnsFragment()
            1 -> VerbalFragment()
            2 -> PhoneFragment()
            else -> ChatFragment()
        }

    }
}