package com.brunowcnascimento.oramainvestimentos.data.network

import com.brunowcnascimento.oramainvestimentos.data.response.FundDetailResponseItem
import retrofit2.http.GET

interface Service {

    @GET("/orama-media/json/fund_detail_full.json?serializer=fund_detail_full")
    suspend fun getFundDetail(): List<FundDetailResponseItem>
}