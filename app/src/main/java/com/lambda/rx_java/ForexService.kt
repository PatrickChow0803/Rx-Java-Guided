package com.lambda.rx_java

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.*

interface ForexService {

    @GET("{currency}")
    fun getRatesFor(@Path("currency") currency: String): Single<Rates>
}