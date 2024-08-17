package com.mehdisekoba.drdr.ui.home.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.data.model.home.ResponseHome.Result.Doctor
import com.mehdisekoba.drdr.databinding.ItemUrgentVisitBinding
import com.mehdisekoba.drdr.utils.base.BaseDiffUtils
import com.mehdisekoba.drdr.utils.extensions.loadImage
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AdapterUrgentVisit @Inject constructor(@ApplicationContext val context: Context) :
    RecyclerView.Adapter<AdapterUrgentVisit.ViewHolder>() {
    private var items = emptyList<Doctor>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemUrgentVisitBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onViewDetachedFromWindow(holder: ViewHolder) {
        super.onViewDetachedFromWindow(holder)
        holder.clearAnimation()
    }

    override fun onViewAttachedToWindow(holder: ViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.initAnimation()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])
    override fun getItemCount() = if (items.size > 12) 12 else items.size
    inner class ViewHolder(private val binding: ItemUrgentVisitBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: Doctor) {
            //init view
            binding.apply {
                //avatar
                if (item.avatarPath != null) {
                    avatarDoctor.loadImage(item.avatarPath)
                } else {
                    avatarDoctor.load(R.drawable.placeholder)
                }
                //first name last name
                txtName.text = "${item.firstname} ${item.lastname}"
                //status
                avatarStatusImg.isVisible = (item.status == 1)
                if (item.status == 1) {
                    responseDuration.text = context.getString(R.string.ready_to_answer)
                }
                //rate
                txtRate.text = item.statistic?.ratesAverage.toString()
                //expertise
                txtExpertise.text = item.subspecialities?.get(0)!!.irimcSubspecialityTitle
                //Consultation
                txtConsultationDuration.text = "${item.appointmentServices?.get(0)?.duration} ${
                    context.getString(
                        R.string.minute
                    )
                }"
                //status
                btnStatus.text = context.getString(R.string.ready_to_answer)
                //animation
                avatarStatusImg.animation =
                    AnimationUtils.loadAnimation(context, R.anim.flash_leave_now)
            }
        }

        fun initAnimation() {
            binding.avatarStatusImg.animation =
                AnimationUtils.loadAnimation(context, R.anim.flash_leave_now)
        }

        fun clearAnimation() {
            binding.avatarStatusImg.clearAnimation()
        }
    }

    fun setData(item: List<Doctor>) {
        val adapterDiffUtils = BaseDiffUtils(items, item)
        val diffUtils = DiffUtil.calculateDiff(adapterDiffUtils)
        items = item
        diffUtils.dispatchUpdatesTo(this)

    }
}