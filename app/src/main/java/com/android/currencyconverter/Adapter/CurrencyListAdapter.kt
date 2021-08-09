package com.app.pharmadawa.ui.notification

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.android.currencyconverter.Model.CurrencyListDataModel
import com.android.currencyconverter.R
import com.example.application.hypermarket_android.listener.RecyclerViewClickListener
import org.w3c.dom.Text
import java.util.*

class CurrencyListAdapter(
    private val context: Context,
    private var listOfCurrency: ArrayList<CurrencyListDataModel>
) :
    RecyclerView.Adapter<CurrencyListAdapter.MyViewHolder>() {

    private lateinit var recyclerViewClickListener: RecyclerViewClickListener

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val parentLayout = itemView.findViewById<LinearLayout>(R.id.parent)
        val tvCountryName = itemView.findViewById<TextView>(R.id.tv_country_name)
        val tvRate = itemView.findViewById<TextView>(R.id.tv_rate)

        init {


            parentLayout.setOnClickListener {
                recyclerViewClickListener.onClick(R.id.parent, adapterPosition)
            }


        }

    }

    //Inflate view for recycler
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_currency_list, p0, false)
        return MyViewHolder(view)
    }

    //Return size
    override fun getItemCount(): Int {
        return listOfCurrency.size
    }

    //Bind View Holder
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.tvCountryName.text = getItem(position).countryName
        holder.tvRate.text = getItem(position).rate.toString()


    }


    fun getItem(position: Int): CurrencyListDataModel {
        return listOfCurrency[position]
    }

    fun setRecyclerViewClickListener(recyclerViewClickListener: RecyclerViewClickListener) {
        this.recyclerViewClickListener = recyclerViewClickListener
    }


}