package com.brunowcnascimento.oramainvestimentos.data.helper

import android.view.View
import com.brunowcnascimento.oramainvestimentos.R

fun View.setBarColor(risk: Int?) {
    when(risk) {
        1 -> setBackgroundResource(R.drawable.bar_left_green)
        2 -> setBackgroundResource(R.drawable.bar_left_yellow)
        3 -> setBackgroundResource(R.drawable.bar_left_orange)
    }
}