package com.mehdisekoba.drdr.ui.turns

import android.view.LayoutInflater
import com.mehdisekoba.drdr.databinding.FragmentChatBinding
import com.mehdisekoba.drdr.utils.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChatFragment : BaseFragment<FragmentChatBinding>() {
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentChatBinding
        get() = FragmentChatBinding::inflate

}