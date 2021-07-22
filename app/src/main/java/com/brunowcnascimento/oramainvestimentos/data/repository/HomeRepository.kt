package com.brunowcnascimento.oramainvestimentos.data.repository

import com.brunowcnascimento.oramainvestimentos.data.model.FundDetail
import com.brunowcnascimento.oramainvestimentos.data.network.Api
import com.brunowcnascimento.oramainvestimentos.data.response.FundDetailResponseItem

class HomeRepository {

    private val service = Api.serviceFundDetail()

    suspend fun getFundDetail(): List<FundDetail> {
        return setListFund(service.getFundDetail())
    }

    private fun setListFund(list: List<FundDetailResponseItem>): List<FundDetail> {
        val listFund = mutableListOf<FundDetail>()
        list.forEach {
                listFund.add(
                    FundDetail(
                        name = it.specification.fundMainStrategy.name,
                        specification = it.specification.fundMainStrategyName,
                        simpleName = it.simpleName,
                        minInitApplication = it.operability.minimumInitialApplicationAmount,
                        last12Months = it.profitabilities.m12
                    )
                )
        }
        return listFund
    }
}