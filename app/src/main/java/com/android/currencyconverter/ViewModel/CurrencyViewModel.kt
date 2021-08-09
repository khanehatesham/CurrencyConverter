package com.android.currencyconverter.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.android.currencyconverter.Repository.MainRepository
import com.example.kotlinecoroutines.Resource
import kotlinx.coroutines.Dispatchers

class CurrencyViewModel (private val mainRepository: MainRepository): ViewModel() {

    fun getCurrency() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}
