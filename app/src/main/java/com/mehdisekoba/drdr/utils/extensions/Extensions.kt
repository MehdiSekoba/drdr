package com.mehdisekoba.drdr.utils.extensions

import android.content.Context
import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.request.CachePolicy
import com.facebook.shimmer.ShimmerFrameLayout
import com.google.android.material.snackbar.Snackbar
import com.mehdisekoba.drdr.R
import java.text.DecimalFormat


fun ImageView.loadImage(url: String) {
    this.load(url) {
        crossfade(true)
        crossfade(500)
        diskCachePolicy(CachePolicy.ENABLED)
        error(R.drawable.placeholder)
    }
}


fun RecyclerView.setupRecyclerview(
    myLayoutManager: RecyclerView.LayoutManager,
    myAdapter: RecyclerView.Adapter<*>
) {
    this.apply {
        layoutManager = myLayoutManager
        setHasFixedSize(true)
        adapter = myAdapter

    }
}

fun View.showCustomSnackbar(
    message: String,
    actionText: String,
    length: Int = Snackbar.LENGTH_INDEFINITE,
    action: (() -> Unit)? = null
) {
    Snackbar.make(this, message, length).apply {
        setAction(actionText) {
            action?.invoke()
        }
        setActionTextColor(ContextCompat.getColor(context, R.color.white))
        setBackgroundTint(ContextCompat.getColor(context, R.color.Brandeis_Blue))
    }.show()
}

fun String.colorize(
    context: Context,
    colorResId: Int,
    start: Int = 0,
    end: Int = this.length
): SpannableString {
    val spannableString = SpannableString(this)
    spannableString.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, colorResId)),
        start,
        end,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    return spannableString
}

fun String.stylize(): SpannableString {
    val spannableString = SpannableString(this)
    spannableString.setSpan(
        StyleSpan(Typeface.ITALIC),
        0,
        this.length,
        Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    spannableString.setSpan(
        RelativeSizeSpan(0.8f),
        0,
        this.length,
        Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    return spannableString
}

fun TextView.setCustomizeDrawables(
    startDrawableRes: Int? = null,
    endDrawableRes: Int? = null,
    size: Int = 24
) {
    val startDrawable = startDrawableRes?.let {
        ContextCompat.getDrawable(context, it)?.apply {
            setBounds(0, 0, size, size)
        }
    }
    val endDrawable = endDrawableRes?.let {
        ContextCompat.getDrawable(context, it)?.apply {
            setBounds(0, 0, size, size)
        }
    }
    setCompoundDrawablesRelative(startDrawable, null, endDrawable, null)
}
fun Int.moneySeparating(): String {
    return "${DecimalFormat("#,###.##").format(this)} تومان"
}
 fun ShimmerFrameLayout.toggleVisibility(shouldShow: Boolean) {
    if (shouldShow) {
        startShimmer()
        isVisible = true
    } else {
        stopShimmer()
        hideShimmer()
        isVisible = false
    }
}
