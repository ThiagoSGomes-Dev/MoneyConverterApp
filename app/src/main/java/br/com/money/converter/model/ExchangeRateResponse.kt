package br.com.money.converter.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ExchangeRateResponse(
    @SerializedName("from") val from: String,
    @SerializedName("to") val to: String,
    @SerializedName("exchange_rate") val exchangeRate: Double
): Parcelable
