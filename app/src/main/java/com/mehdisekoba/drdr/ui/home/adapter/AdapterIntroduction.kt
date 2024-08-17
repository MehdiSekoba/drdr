package com.mehdisekoba.drdr.ui.home.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.buildSpannedString
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.data.model.home.ResponseIntroduction.Result.Doctor
import com.mehdisekoba.drdr.data.model.home.ResponseIntroduction.Result.Schedule
import com.mehdisekoba.drdr.databinding.ItemIntroductionBinding
import com.mehdisekoba.drdr.utils.base.BaseDiffUtils
import com.mehdisekoba.drdr.utils.extensions.colorize
import com.mehdisekoba.drdr.utils.extensions.convertMothDayToFarsi
import com.mehdisekoba.drdr.utils.extensions.loadImage
import com.mehdisekoba.drdr.utils.extensions.setCustomizeDrawables
import com.mehdisekoba.drdr.utils.extensions.stylize
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AdapterIntroduction @Inject constructor(@ApplicationContext val context: Context) :
    RecyclerView.Adapter<AdapterIntroduction.ViewHolder>() {
    private var items = emptyList<Doctor>()
    private var schedules: List<Schedule>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemIntroductionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])
    override fun getItemCount() = if (items.size > 10) 10 else items.size
    override fun getItemId(position: Int) = position.toLong()
    override fun getItemViewType(position: Int) = position

    inner class ViewHolder(private val binding: ItemIntroductionBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: Doctor) {
            //init view
            binding.apply {
                //avatar
                //avatar
                if (item.avatarPath != null) {
                    avatarDoctor.loadImage(item.avatarPath)
                } else {
                    avatarDoctor.load(R.drawable.placeholder)
                }
                //first name last name
                doctorNameFamily.text = "${item.firstname} ${item.lastname}"
                //location
                txtLocation.text = buildSpannedString {
                    append(item.province?.title!!)
                    append(" ، ")
                    append(item.clinics?.get(0)?.address)
                    append(" ")
                }
                txtLocation.setCustomizeDrawables(startDrawableRes = R.drawable.location, size = 35)

                //waiting
                if (item.appointmentServices?.get(0)?.averageWaitingTime!! == 0) {
                    waiting.visibility = View.INVISIBLE
                    txtWaiting.visibility = View.INVISIBLE
                } else {
                    waiting.visibility = View.VISIBLE
                    txtWaiting.visibility = View.VISIBLE

                    waiting.text = "${
                        item.appointmentServices[0].averageWaitingTime.toString()
                    } ${
                        context.getString(
                            R.string.minute
                        )
                    }"
                }

                //rate
                txtRate.text = item.statistic!!.ratesAverage
                //expertise
                txtExpertise.text = item.subspecialities?.get(0)!!.irimcSubspecialityTitle


                //time
                val turnDoctor = schedules!!.find { it.doctorId == item.id }
                turnDoctor?.start?.let { time ->
                    val date = time.split(" ")[0].convertMothDayToFarsi()
                    val hour = time.split(" ")[1].substring(0, 5)
                    timeTurn.text = "$date $hour"


                }
            }
        }

    }


    fun setData(doctors: List<Doctor>, schedules: List<Schedule>) {
        val adapterDiffUtils = BaseDiffUtils(items, doctors)
        val diffUtils = DiffUtil.calculateDiff(adapterDiffUtils)
        items = doctors
        this.schedules = schedules
        diffUtils.dispatchUpdatesTo(this)
    }
}

