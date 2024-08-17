package com.mehdisekoba.drdr.ui.home.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.data.model.home.ResponseClinics.Result.Clinic
import com.mehdisekoba.drdr.databinding.ItemClinicBinding
import com.mehdisekoba.drdr.utils.base.BaseDiffUtils
import com.mehdisekoba.drdr.utils.extensions.loadImage
import com.mehdisekoba.drdr.utils.extensions.setCustomizeDrawables
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AdapterClinicVisit @Inject constructor(@ApplicationContext val context: Context) :
    RecyclerView.Adapter<AdapterClinicVisit.ViewHolder>() {
    private var items = emptyList<Clinic>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemClinicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])
    override fun getItemCount() = if (items.size > 10) 10 else items.size
    inner class ViewHolder(private val binding: ItemClinicBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: Clinic) {
            //init view
            binding.apply {
                //avatar
                if (item.avatarPath != null) {
                    avatarClinic.loadImage(item.avatarPath)
                } else {
                    avatarClinic.load(R.drawable.placeholder)
                }
                txtNameClinic . text = item . title
                        txtLocation.text = "${item.city?.title} , ${item.address}"
                txtLocation.setCustomizeDrawables(startDrawableRes = R.drawable.location, size = 35)

            }
        }

    }

    fun setData(item: List<Clinic>) {
        val adapterDiffUtils = BaseDiffUtils(items, item)
        val diffUtils = DiffUtil.calculateDiff(adapterDiffUtils)
        items = item
        diffUtils.dispatchUpdatesTo(this)

    }
}