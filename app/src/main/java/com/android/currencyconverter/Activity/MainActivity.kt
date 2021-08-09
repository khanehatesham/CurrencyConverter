package com.android.currencyconverter.Activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.currencyconverter.Model.CurrencyListDataModel
import com.android.currencyconverter.R
import com.android.currencyconverter.Utils.Helper
import com.android.currencyconverter.ViewModel.CurrencyViewModel
import com.android.currencyconverter.ViewModel.ViewModelFactory
import com.android.currencyconverter.retrofit.RetrofitBuilder
import com.app.pharmadawa.ui.notification.CurrencyListAdapter
import com.example.application.hypermarket_android.listener.RecyclerViewClickListener
import com.example.kotlinecoroutines.Status
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: CurrencyViewModel
    private lateinit var adapter: CurrencyListAdapter

    private  var list: ArrayList<CurrencyListDataModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this, ViewModelFactory(RetrofitBuilder.apiService()))
            .get(CurrencyViewModel::class.java)
        rv_currency.layoutManager = LinearLayoutManager(baseContext)
        adapter = CurrencyListAdapter( baseContext!!,list)
        rv_currency.adapter = adapter
        setupObservers()




        tv_reload.setOnClickListener({

            if (Helper.isNetworkAvailable(this)){
                setupObservers()
            }else{
                Toast.makeText(baseContext,resources.getString(R.string.message_no_internet_connection),Toast.LENGTH_SHORT).show()

            }
        })

    }

    private fun setupObservers() {

        viewModel.getCurrency().observe(this, Observer {
            it?.let { resource ->
                when (resource.status) {
                    Status.SUCCESS -> {
//                        recyclerView.visibility = View.VISIBLE
                        tv_reload.visibility = View.GONE
                        progressBar.visibility = View.GONE
                        Toast.makeText(baseContext,"sucess",Toast.LENGTH_SHORT).show()


                        tv_toolbar_title.setText(it.data!!.base)
                        list.addAll(it.data!!.getCurrencyList())



                        adapter.setRecyclerViewClickListener(object : RecyclerViewClickListener{
                            override fun onClick(id: Int, position: Int) {

                                startActivity(Intent(this@MainActivity,CurrencyConverterActivity::class.java).putExtra("data",adapter.getItem(position)).putExtra("base",it.data!!.base))

                            }


                        })


//                        Log.d("rates==",list.toString())
                        adapter.notifyDataSetChanged()

                    }
                    Status.ERROR -> {
                        tv_reload.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()


                    }
                    Status.LOADING -> {
                        progressBar.visibility = View.VISIBLE
                        //recyclerView.visibility = View.GONE
                        tv_reload.visibility = View.GONE
                    }
                }
            }
        })
    }

}