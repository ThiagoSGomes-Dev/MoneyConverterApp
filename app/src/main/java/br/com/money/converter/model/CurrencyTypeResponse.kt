package br.com.money.converter.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class CurrencyTypeResultResponse (
    @SerializedName("values") val values: List<CurrencyTypeResponse>
) : Parcelable {

    @Parcelize
    data class CurrencyTypeResponse(
        @SerializedName("name") val name: String,
        @SerializedName("acronym") val acronym: String,
        @SerializedName("symbol") val symbol: String,
        @SerializedName("country_flag_image_url") val countryFlagImageUrl: String
    ) : Parcelable
}