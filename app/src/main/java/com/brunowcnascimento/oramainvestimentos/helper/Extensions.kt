package com.brunowcnascimento.oramainvestimentos.helper

import android.view.View
import com.brunowcnascimento.oramainvestimentos.R
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

fun View.setBarColor(risk: Int?) {
    when(risk) {
        1 -> setBackgroundResource(R.drawable.bar_left_green)
        2 -> setBackgroundResource(R.drawable.bar_left_yellow)
        3 -> setBackgroundResource(R.drawable.bar_left_orange)
    }
}

fun String.formatCurrency(): String {
    val real = Locale("pt", "BR")
    return NumberFormat.getCurrencyInstance(real).format(this.toDouble())
}

fun String.formatPercent() : String {
    val df = DecimalFormat("#,##0.00")
    return "${df.format(this.toDouble() * 100)}%"
}