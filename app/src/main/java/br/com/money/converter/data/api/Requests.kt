package br.com.money.converter.data.api

object URL {
    const val BASE = "/currency"

    object TYPES {
        const val TYPE = "$BASE/currency-types"

        object VERSION {
            const val V1 = "/v1"
        }
    }
}