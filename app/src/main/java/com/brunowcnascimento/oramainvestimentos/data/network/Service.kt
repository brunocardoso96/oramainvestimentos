package com.brunowcnascimento.oramainvestimentos.data.network

import com.brunowcnascimento.oramainvestimentos.data.response.FundDetailResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {

    @GET("orama-media/json/fund_detail_full.json")
    fun getFundDetail(@Query("serializer") serializer: String): FundDetailResponse
}