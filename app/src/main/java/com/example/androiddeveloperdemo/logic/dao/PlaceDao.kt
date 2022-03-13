package com.example.androiddeveloperdemo.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.example.androiddeveloperdemo.SunnyWeatherApplication
import com.example.androiddeveloperdemo.logic.model.Place

//objct or class 区别？
object PlaceDao {

    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)

}