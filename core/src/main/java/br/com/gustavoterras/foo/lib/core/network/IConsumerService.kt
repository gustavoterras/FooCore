package br.com.gustavoterras.foo.lib.core.network

import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

interface IConsumerService {

    @GET
    fun events(@Url url: String): Observable<List<Any>>

    companion object Factory {
        fun create(): IConsumerService {

            val httpClient = OkHttpClient.Builder()

            val loggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

            val retrofit = Retrofit.Builder()
                    .client(httpClient.addInterceptor(loggingInterceptor).build())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://google.com")
                    .build()

            return retrofit.create(IConsumerService::class.java)
        }
    }
}
