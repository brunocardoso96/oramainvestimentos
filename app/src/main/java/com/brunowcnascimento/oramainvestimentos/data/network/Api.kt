package com.brunowcnascimento.oramainvestimentos.data.network

import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {

    val FUNDDETAIL = "https://s3.amazonaws.com"
    const val SERIALIZER = "fund_detail_full"

    fun serviceFundDetail(): Service {
        return Retrofit.Builder()
            .baseUrl(FUNDDETAIL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().apply {
                addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.HEADERS
                })
            }.build())
            .build().create(Service::class.java)
    }
}