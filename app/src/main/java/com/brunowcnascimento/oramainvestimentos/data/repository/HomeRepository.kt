package com.brunowcnascimento.oramainvestimentos.data.repository

import com.brunowcnascimento.oramainvestimentos.data.model.FundDetail
import com.brunowcnascimento.oramainvestimentos.data.network.Api

class HomeRepository {

    private val service = Api.serviceFundDetail()

    suspend fun getFundDetail(): List<FundDetail> {
        return service.getFundDetail()
            .fundDetailResponse.map {
                FundDetail(
                    name = it.specification.fundMainStrategy.name,
                    specification = it.specification.fundMainStrategyName,
                    simpleName = it.simpleName,
                    minInitApplication = it.operability.minimumInitialApplicationAmount,
                    last12Months = it.profitabilities.m12
                )
            }
    }

}