package com.example.androiddeveloperdemo.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//单例类
object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/"

    private var retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>) : T = retrofit.create(serviceClass)

    inline fun <reified  T> create() : T = create(T::class.java)
}