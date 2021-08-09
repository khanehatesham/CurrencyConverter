package com.android.currencyconverter.Model

import java.util.*

data class CurrencyObjectDataModel(
    var sucess: Boolean, var base: String, var date: String, var rates: RateListDataModel
) {
    data class RateListDataModel(
        var AED: Double,
        var AFN: Double,
        var ALL: Double,
        var AMD: Double,
        var ANG: Double,
        var AOA: Double,
        var ARS: Double,
        var AUD: Double,
        var AWG: Double,
        var AZN: Double,
        var BAM: Double,
        var BBD: Double,
        var BDT: Double,
        var BGN: Double,
        var BHD: Double,
        var BIF: Double,
        var BMD: Double,
        var BND: Double,
        var BOB: Double,
        var BRL: Double,
        var BSD: Double,
        var BTC: Double,
        var BTN: Double,
        var BWP: Double,
        var BYN: Double,
        var BYR: Double,
        var BZD: Double,
        var CRC: Double,
        var CUC: Double,
        var CUP: Double,
        var CVE: Double,
        var CZK: Double,
        var DJF: Double,
        var DKK: Double,
        var DOP: Double,
        var DZD: Double,
        var EGP: Double,
        var EUR: Double,
        var GGP: Double,
        var GHS: Double,
        var GIP: Double,
        var GMD: Double,
        var GNF: Double,
        var GTQ: Double,
        var GYD: Double,
        var HKD: Double,
        var HNL: Double,
        var HRK: Double,
        var HTG: Double,
        var HUF: Double,
        var IDR: Double,
        var ILS: Double,
        var IMP: Double,
        var INR: Double,
        var IQD: Double,
        var IRR: Double,
        var ISK: Double,
        var JEP: Double,
        var JMD: Double,
        var JOD: Double,
        var JPY: Double,
        var KES: Double,
        var KGS: Double,
        var KHR: Double,
        var KMF: Double,
        var KPW: Double,
        var KRW: Double,
        var KWD: Double,
        var KYD: Double,
        var KZT: Double,
        var LAK: Double,
        var LBP: Double,
        var LKR: Double,
        var LRD: Double,
        var LSL: Double,
        var LTL: Double,
        var LVL: Double,
        var LYD: Double,
        var MXN: Double,
        var MYR: Double,
        var MZN: Double,
        var NZD: Double,
        var OMR: Double,
        var PAB: Double,
        var PEN: Double,
        var PGK: Double,
        var PHP: Double,
        var PKR: Double,
        var PLN: Double,
        var PYG: Double,
        var QAR: Double,
        var RON: Double,
        var RSD: Double,
        var RUB: Double,
        var RWF: Double,
        var SAR: Double
    )


    fun getCurrencyList(): ArrayList<CurrencyListDataModel> {


        var list= ArrayList<CurrencyListDataModel>()

        list.add(CurrencyListDataModel("AED",rates.AED))
        list.add(CurrencyListDataModel("AFN",rates.AFN))
        list.add(CurrencyListDataModel("ALL",rates.ALL))
        list.add(CurrencyListDataModel("AMD",rates.AMD))
        list.add(CurrencyListDataModel("ANG",rates.ANG))
        list.add(CurrencyListDataModel("AOA",rates.AOA))
        list.add(CurrencyListDataModel("ARS",rates.ARS))
        list.add(CurrencyListDataModel("AUD",rates.AUD))
        list.add(CurrencyListDataModel("AWG",rates.AWG))
        list.add(CurrencyListDataModel("AZN",rates.AZN))
        list.add(CurrencyListDataModel("BAM",rates.BAM))
        list.add(CurrencyListDataModel("BBD",rates.BBD))
        list.add(CurrencyListDataModel("BDT",rates.BDT))
        list.add(CurrencyListDataModel("BGN",rates.BGN))
        list.add(CurrencyListDataModel("BHD",rates.BHD))
        list.add(CurrencyListDataModel("BIF",rates.BIF))
        list.add(CurrencyListDataModel("BMD",rates.BMD))
        list.add(CurrencyListDataModel("BOB",rates.BOB))
        list.add(CurrencyListDataModel("BRL",rates.BRL))
        list.add(CurrencyListDataModel("BSD",rates.BSD))
        list.add(CurrencyListDataModel("BTC",rates.BTC))
        list.add(CurrencyListDataModel("BTN",rates.BTN))
        list.add(CurrencyListDataModel("BWP",rates.BWP))
        list.add(CurrencyListDataModel("BYN",rates.BYN))
        list.add(CurrencyListDataModel("BYR",rates.BYR))
        list.add(CurrencyListDataModel("BZD",rates.BZD))
        list.add(CurrencyListDataModel("CRC",rates.CRC))
        list.add(CurrencyListDataModel("CUC",rates.CUC))
        list.add(CurrencyListDataModel("CUP",rates.CUP))
        list.add(CurrencyListDataModel("CVE",rates.CVE))
        list.add(CurrencyListDataModel("CZK",rates.CZK))
        list.add(CurrencyListDataModel("DJF",rates.DJF))
        list.add(CurrencyListDataModel("DKK",rates.DKK))
        list.add(CurrencyListDataModel("DOP",rates.DOP))
        list.add(CurrencyListDataModel("DZD",rates.DZD))
        list.add(CurrencyListDataModel("EGP",rates.EGP))
        list.add(CurrencyListDataModel("EUR",rates.EUR))
        list.add(CurrencyListDataModel("GGP",rates.GGP))
        list.add(CurrencyListDataModel("GHS",rates.GHS))
        list.add(CurrencyListDataModel("GIP",rates.GIP))
        list.add(CurrencyListDataModel("GMD",rates.GMD))
        list.add(CurrencyListDataModel("GNF",rates.GNF))
        list.add(CurrencyListDataModel("GTQ",rates.GTQ))
        list.add(CurrencyListDataModel("GYD",rates.GYD))
        list.add(CurrencyListDataModel("HKD",rates.HKD))
        list.add(CurrencyListDataModel("HNL",rates.HNL))
        list.add(CurrencyListDataModel("HRK",rates.HRK))
        list.add(CurrencyListDataModel("HTG",rates.HTG))
        list.add(CurrencyListDataModel("HUF",rates.HUF))
        list.add(CurrencyListDataModel("IDR",rates.IDR))
        list.add(CurrencyListDataModel("ILS",rates.ILS))
        list.add(CurrencyListDataModel("IMP",rates.IMP))
        list.add(CurrencyListDataModel("INR",rates.INR))
        list.add(CurrencyListDataModel("IQD",rates.IQD))
        list.add(CurrencyListDataModel("ISK",rates.ISK))
        list.add(CurrencyListDataModel("IRR",rates.IRR))
        list.add(CurrencyListDataModel("JEP",rates.JEP))
        list.add(CurrencyListDataModel("JMD",rates.JMD))
        list.add(CurrencyListDataModel("JOD",rates.JOD))
        list.add(CurrencyListDataModel("JPY",rates.JPY))
        list.add(CurrencyListDataModel("KES",rates.KES))
        list.add(CurrencyListDataModel("KGS",rates.KGS))
        list.add(CurrencyListDataModel("KHR",rates.KHR))
        list.add(CurrencyListDataModel("KMF",rates.KMF))
        list.add(CurrencyListDataModel("KPW",rates.KPW))
        list.add(CurrencyListDataModel("KRW",rates.KRW))
        list.add(CurrencyListDataModel("KWD",rates.KWD))
        list.add(CurrencyListDataModel("KYD",rates.KYD))
        list.add(CurrencyListDataModel("KZT",rates.KZT))
        list.add(CurrencyListDataModel("LAK",rates.LAK))
        list.add(CurrencyListDataModel("LBP",rates.LBP))
        list.add(CurrencyListDataModel("LKR",rates.LKR))
        list.add(CurrencyListDataModel("LRD",rates.LRD))
        list.add(CurrencyListDataModel("LSL",rates.LSL))
        list.add(CurrencyListDataModel("LTL",rates.LTL))
        list.add(CurrencyListDataModel("LVL",rates.LVL))
        list.add(CurrencyListDataModel("LYD",rates.LYD))
        list.add(CurrencyListDataModel("MXN",rates.MXN))
        list.add(CurrencyListDataModel("MYR",rates.MYR))
        list.add(CurrencyListDataModel("MZN",rates.MZN))
        list.add(CurrencyListDataModel("NZD",rates.NZD))
        list.add(CurrencyListDataModel("OMR",rates.OMR))
        list.add(CurrencyListDataModel("PAB",rates.PAB))
        list.add(CurrencyListDataModel("PEN",rates.PEN))
        list.add(CurrencyListDataModel("PGK",rates.PGK))
        list.add(CurrencyListDataModel("PHP",rates.PHP))
        list.add(CurrencyListDataModel("PKR",rates.PKR))
        list.add(CurrencyListDataModel("PLN",rates.PLN))
        list.add(CurrencyListDataModel("PYG",rates.PYG))
        list.add(CurrencyListDataModel("QAR",rates.QAR))
        list.add(CurrencyListDataModel("RON",rates.RON))
        list.add(CurrencyListDataModel("RSD",rates.RSD))
        list.add(CurrencyListDataModel("RUB",rates.RUB))
        list.add(CurrencyListDataModel("RWF",rates.RWF))
        list.add(CurrencyListDataModel("SAR",rates.SAR))






        return list

    }
}