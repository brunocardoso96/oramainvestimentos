package com.brunowcnascimento.oramainvestimentos.data.repository

import com.brunowcnascimento.oramainvestimentos.data.model.FundDetail
import com.brunowcnascimento.oramainvestimentos.data.network.Api
import com.brunowcnascimento.oramainvestimentos.data.response.FundDetailResponseItem

class HomeRepository {

    private val service = Api.serviceFundDetail()

    suspend fun getFundDetail(): List<FundDetail> {
        return setListFund(service.getFundDetail(Api.SERIALIZER))
    }

    private fun setListFund(list: List<FundDetailResponseItem>): List<FundDetail> {
        val listFund = mutableListOf<FundDetail>()
        list.forEach {
            listFund.add(
                FundDetail(
                    name = it.specification.fundMacroStrategy.name,
                    specification = it.specification.fundMainStrategyName,
                    simpleName = it.simpleName,
                    minimumApplication = it.operability.minimumInitialApplicationAmount,
                    profitabilityLast12Months = it.profitabilities.m12,
                    profitabilityLastMonth = it.profitabilities.month,
                    profitabilityLastYear = it.profitabilities.year,
                    retrievalQuotation = it.operability.retrievalQuotationDaysStr,
                    subsequentRetrieval = it.operability.minimumSubsequentRetrievalAmount,
                    minimumBalancePermanence = it.operability.minimumBalancePermanence,
                    minimumInitialApplication = it.operability.minimumInitialApplicationAmount,
                    applicationQuotationDays = it.operability.applicationQuotationDaysStr,
                    applicationTimeLimit = it.operability.applicationTimeLimit,
                    risk = it.specification.fundSuitabilityProfile.scoreRangeOrder
                )
            )
        }
        return listFund
    }
}