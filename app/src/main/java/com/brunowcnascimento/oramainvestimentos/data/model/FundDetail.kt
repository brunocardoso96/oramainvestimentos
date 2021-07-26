package com.brunowcnascimento.oramainvestimentos.data.model

import java.io.Serializable

data class FundDetail(
    val name: String? = "",
    val specification: String? = "",
    val simpleName: String? = "",
    val minInitApplication: String? = "",
    val last12Months: String? = "",
    val risk: Int? = 0
) : Serializable