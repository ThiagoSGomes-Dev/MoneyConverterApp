package br.com.money.converter.data.api

object RetrofitService {
    val api: CurrencyApi by lazy {
        RetrofitProvider.retrofit.create(CurrencyApi::class.java)
    }
}