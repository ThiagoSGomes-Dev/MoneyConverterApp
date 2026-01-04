package br.com.money.converter.data.api

import br.com.money.converter.data.api.URL.TYPES
import br.com.money.converter.model.CurrencyTypeResultResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface CurrencyApi {
    @GET(CURRENCY_TYPE)
    fun getCurrencyTypes(): Single<CurrencyTypeResultResponse>

    companion object {
        const val CURRENCY_TYPE = "${TYPES.TYPE}${TYPES.VERSION.V1}/metadata"
    }
}