package com.android.currencyconverter.Repository

import com.android.currencyconverter.retrofit.ApiService

class MainRepository(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getCountry()


}