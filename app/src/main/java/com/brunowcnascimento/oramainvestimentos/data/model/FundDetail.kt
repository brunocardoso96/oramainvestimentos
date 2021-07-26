package com.brunowcnascimento.oramainvestimentos.data.model

import java.io.Serializable

data class FundDetail(
    val name: String? = "",
    val specification: String? = "",
    val simpleName: String? = "",
    val minimumApplication: String? = "",
    val profitabilityLast12Months: String? = "",
    val profitabilityLastMonth: String? = "",
    val profitabilityLastYear: String? = "",
    val retrievalQuotation: String? = "",
    val subsequentRetrieval: String? = "",
    val minimumBalancePermanence: String? = "",
    val minimumInitialApplication: String? = "",
    val applicationQuotationDays: String? = "",
    val applicationTimeLimit: String? = "",
    val risk: Int? = 0
) : Serializable