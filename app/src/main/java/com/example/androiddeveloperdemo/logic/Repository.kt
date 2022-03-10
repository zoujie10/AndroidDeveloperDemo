package com.example.androiddeveloperdemo.logic

import androidx.lifecycle.liveData
import com.example.androiddeveloperdemo.logic.model.Place
import com.example.androiddeveloperdemo.logic.network.SunnyWeatherNetWork
import kotlinx.coroutines.Dispatchers
import retrofit2.http.Query
import java.lang.Exception
import java.lang.RuntimeException

//单例  仓库层
object Repository {
    //自动构建并返回一个LiveData对象
    fun searchPlaces(query: String) = liveData(Dispatchers.IO){
        var result = try {
            var placeResponse = SunnyWeatherNetWork.searchPlaces(query)
            if (placeResponse.status == "ok"){
                val places = placeResponse.places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        }catch (e:Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)//通知数据变化
    }
}