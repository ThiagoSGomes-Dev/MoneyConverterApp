package br.com.money.converter.data.api

object CurrencyService {
    val api: CurrencyApi by lazy {
        RetrofitProvider.retrofit.create(CurrencyApi::class.java)
    }
}