package com.mehdisekoba.drdr.ui.home.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.text.buildSpannedString
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.data.model.home.ResponseComment.Result.Review
import com.mehdisekoba.drdr.databinding.ItemCommentBinding
import com.mehdisekoba.drdr.utils.base.BaseDiffUtils
import com.mehdisekoba.drdr.utils.extensions.colorize
import com.mehdisekoba.drdr.utils.extensions.convertDateToFarsi
import com.mehdisekoba.drdr.utils.extensions.convertMothDayToFarsi
import com.mehdisekoba.drdr.utils.extensions.stylize
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AdapterComment @Inject constructor(@ApplicationContext val context: Context) :
    RecyclerView.Adapter<AdapterComment.ViewHolder>() {
    private var items = emptyList<Review>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemCommentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])
    override fun getItemCount() = items.size
    inner class ViewHolder(private val binding: ItemCommentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: Review) {
            //init view
            binding.apply {
                //date
                txtDate.text = item.createdAt!!.split(" ")[0].convertDateToFarsi()
                //rate
                txtRate.text = item.rate.toString()
                //comment
                commentVisit.text = item.comment
                //reference
                txtReference.text = buildSpannedString {
                    append(context.getString(R.string.txt_reference)
                        .colorize(context, R.color.Brandeis_Blue, start = 0, end = 6))

                    append(" به ".stylize())
                    append(item.doctor?.firstname ?: "")
                    append(" ")
                    append(item.doctor?.lastname ?: "")
                }
            }
        }

    }

    fun setData(item: List<Review>) {
        val adapterDiffUtils = BaseDiffUtils(items, item)
        val diffUtils = DiffUtil.calculateDiff(adapterDiffUtils)
        items = item
        diffUtils.dispatchUpdatesTo(this)

    }
}