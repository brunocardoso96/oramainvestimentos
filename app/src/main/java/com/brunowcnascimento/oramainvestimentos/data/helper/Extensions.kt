package com.brunowcnascimento.oramainvestimentos.data.helper

import android.view.View
import android.widget.TextView
import com.brunowcnascimento.oramainvestimentos.R
import org.w3c.dom.Text
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