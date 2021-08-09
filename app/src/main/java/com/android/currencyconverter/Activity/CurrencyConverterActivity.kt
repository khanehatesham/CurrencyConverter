package com.android.currencyconverter.Activity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import com.android.currencyconverter.Model.CurrencyListDataModel
import com.android.currencyconverter.R
import kotlinx.android.synthetic.main.activity_currency_converter.*


class CurrencyConverterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency_converter)


        val currencyData: CurrencyListDataModel? = intent.getParcelableExtra("data")
        val base: String? = intent.getStringExtra("base")
        et_base_rate.setText("1")
        tv_base_country.text = base

        tv_rate.setText(currencyData!!.rate.toString())
        tv_country.setText(currencyData!!.countryName)


        et_base_rate.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(
                s: CharSequence,
                start: Int,
                before: Int,
                count: Int
            ) {


                if (s.length != 0) {
                    val number: Int = s.toString().toInt()

                    val rate = number * currencyData.rate
                    tv_rate.setText(rate.toString())
                } else {
                    tv_rate.setText("0:0")

                }

            }

            override fun beforeTextChanged(
                s: CharSequence,
                start: Int,
                count: Int,
                after: Int
            ) {

            }

            override fun afterTextChanged(s: Editable) {
            }
        })


    }
}