package com.mehdisekoba.drdr.ui.turns.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.mehdisekoba.drdr.data.model.turn.TurnRepetition
import com.mehdisekoba.drdr.databinding.ItemVerbalBinding
import com.mehdisekoba.drdr.utils.base.BaseDiffUtils
import com.mehdisekoba.drdr.utils.extensions.convertDateToFarsi
import com.mehdisekoba.drdr.utils.extensions.convertMothDayToFarsi
import com.mehdisekoba.drdr.utils.extensions.loadImage
import com.mehdisekoba.drdr.utils.extensions.moneySeparating
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AdapterVerbal @Inject constructor(@ApplicationContext val context: Context) :
    RecyclerView.Adapter<AdapterVerbal.ViewHolder>() {
    private var items = emptyList<TurnRepetition>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemVerbalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount() = items.size
    inner class ViewHolder(private val binding: ItemVerbalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: TurnRepetition) {
            binding.apply {
                //doctor
                doctorNameFamily.text = "${item.firstname} ${item.lastname}"
                //Expertise
                txtExpertise.text = item.specialities
                //code
                trackingCode.text = item.code
                //verbal
                item.created.let { time ->
                    val date = time.split(" ")[0].convertDateToFarsi()
                    val hour = time.split(" ")[1].substring(0, 5)
                    verbalTime.text = "$date $hour"

                }
                //address
                address.text = item.address
                //phone
                phoneTxt.text = item.phone
                //sick name
                sickName.text = item.name_Patient
                //avatar
                avatarDoctor.loadImage(item.avatar_path)
                //total payment
                totalPayment.text = item.appointment_Reservation.toInt().moneySeparating()
                //reservation
                reservationPrice.text = item.payment.toInt().moneySeparating()
            }
        }

    }

    fun setData(item: List<TurnRepetition>) {
        val adapterDiffUtils = BaseDiffUtils(items, item)
        val diffUtils = DiffUtil.calculateDiff(adapterDiffUtils)
        items = item
        diffUtils.dispatchUpdatesTo(this)

    }

}