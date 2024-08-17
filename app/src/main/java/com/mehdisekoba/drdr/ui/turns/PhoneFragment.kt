package com.mehdisekoba.drdr.ui.turns

import android.view.LayoutInflater
import com.mehdisekoba.drdr.databinding.FragmentPhoneBinding
import com.mehdisekoba.drdr.utils.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class PhoneFragment : BaseFragment<FragmentPhoneBinding>() {
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentPhoneBinding
        get() = FragmentPhoneBinding::inflate
}