package com.android.currencyconverter.retrofit

import com.android.currencyconverter.Model.CurrencyObjectDataModel
import retrofit2.Response
import retrofit2.http.GET


interface ApiService {

    @GET("latest?access_key=eefedbd5255f2efacc93945ef1006969&format=1")
    suspend fun getCountry(): CurrencyObjectDataModel



}