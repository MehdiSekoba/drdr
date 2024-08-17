package com.mehdisekoba.drdr.ui.home.adapter

import android.content.Context
import android.util.LayoutDirection
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.mehdisekoba.drdr.data.model.home.SearchRepetition
import com.mehdisekoba.drdr.databinding.ItemRepetitionSearchBinding
import com.mehdisekoba.drdr.utils.base.BaseDiffUtils
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AdapterSearch @Inject constructor(@ApplicationContext val context: Context) :
    RecyclerView.Adapter<AdapterSearch.ViewHolder>() {
    private var items = emptyList<SearchRepetition>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemRepetitionSearchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount() = items.size
    override fun getItemId(position: Int) = position.toLong()
    override fun getItemViewType(position: Int) = position
    inner class ViewHolder(private val binding: ItemRepetitionSearchBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SearchRepetition) {
            binding.apply {
                mostVisitedChipGroup.removeAllViews()
                val tagList = mutableListOf<String>()
                tagList.add(item.title)
                setupChip(tagList, mostVisitedChipGroup)
            }
        }

        private fun setupChip(list: MutableList<String>, view: ChipGroup) {
            list.forEach {
                val chip = Chip(view.context)
                chip.text = it
                view.addView(chip)
            }
        }
    }

    fun setData(item: List<SearchRepetition>) {
        val adapterDiffUtils = BaseDiffUtils(items, item)
        val diffUtils = DiffUtil.calculateDiff(adapterDiffUtils)
        items = item
        diffUtils.dispatchUpdatesTo(this)

    }

}