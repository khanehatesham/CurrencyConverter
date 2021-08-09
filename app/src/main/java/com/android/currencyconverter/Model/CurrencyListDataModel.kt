package com.android.currencyconverter.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CurrencyListDataModel(var countryName: String, var rate: Double) :Parcelable{


}