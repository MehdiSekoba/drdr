package com.mehdisekoba.drdr.ui.doctor.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.mehdisekoba.drdr.data.model.expertise.ResponseExpertise
import com.mehdisekoba.drdr.data.model.expertise.ResponseExpertise.Specialities
import com.mehdisekoba.drdr.databinding.ItemExpertiseBinding
import com.mehdisekoba.drdr.utils.base.BaseDiffUtils
import com.mehdisekoba.drdr.utils.extensions.loadImage
import javax.inject.Inject

class AdapterExpertise @Inject constructor() :
    RecyclerView.Adapter<AdapterExpertise.ViewHolder>() {

    private var items = emptyList<Specialities>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemExpertiseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    inner class ViewHolder(private val binding: ItemExpertiseBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: Specialities) {
            binding.apply {
                txtTitle.text = item.title
                txtDescription.text = item.content.short_description
                txtCount.text = "${item.total_doctors} ${"+"}"

                val doctors = item.doctors

                if (doctors.isNotEmpty()) avatar1.loadImage(doctors[0].avatar_path)
                avatar1.isVisible = doctors.isNotEmpty()

                if (doctors.size > 1) avatar2.loadImage(doctors[1].avatar_path)
                avatar2.isVisible = doctors.size > 1

                if (doctors.size > 2) avatar3.loadImage(doctors[2].avatar_path)
                avatar3.isVisible = doctors.size > 2
            }
        }

    }

    fun setData(item: List<Specialities>) {
        val adapterDiffUtils = BaseDiffUtils(items, item)
        val diffUtils = DiffUtil.calculateDiff(adapterDiffUtils)
        items = item
        diffUtils.dispatchUpdatesTo(this)

    }

}