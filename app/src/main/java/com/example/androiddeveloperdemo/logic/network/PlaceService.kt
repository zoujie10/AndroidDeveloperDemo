package com.example.androiddeveloperdemo.logic.network

//import android.telecom.Call
import com.example.androiddeveloperdemo.SunnyWeatherApplication
import com.example.androiddeveloperdemo.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    // GET 请求 + 地址   Retrofit内置Call类型，通过泛型来指定服务器响应的数据应该转换成什么对象
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String) : Call<PlaceResponse>
}