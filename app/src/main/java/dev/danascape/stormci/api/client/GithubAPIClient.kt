package dev.danascape.stormci.api.client

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object GithubAPIClient {
    private val BASE_URL = "https://raw.githubusercontent.com/stormbreaker-project/official_devices/master/"
    private var mRetrofit: Retrofit? = null
    val client: Retrofit
        get() {
            if (mRetrofit == null) {
                mRetrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build()
            }
            return mRetrofit!!
        }
}