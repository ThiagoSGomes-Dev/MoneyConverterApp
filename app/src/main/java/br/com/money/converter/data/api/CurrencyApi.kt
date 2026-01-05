package br.com.money.converter.data.api

import br.com.money.converter.model.CurrencyTypeResultResponse
import br.com.money.converter.model.ExchangeRateResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface CurrencyApi {

    @GET(CURRENCY_TYPE)
    fun getCurrencyType(): Single<CurrencyTypeResultResponse>

    @GET(EXCHANGE_RATE)
    fun getExchangeRate(): Single<ExchangeRateResponse>

    companion object {
        const val CURRENCY_TYPE = "${URL.TYPES.TYPE}/metadata"
        const val EXCHANGE_RATE = "${URL.BASE}/exchange-rate/v1/{from}/{to}"
    }
}