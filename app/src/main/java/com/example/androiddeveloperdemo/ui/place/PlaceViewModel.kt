package com.example.androiddeveloperdemo.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.room.Query
import com.example.androiddeveloperdemo.logic.Repository
import com.example.androiddeveloperdemo.logic.model.Place

class PlaceViewModel : ViewModel(){
    private val  searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    //switchMap
    val  placeLiveData = Transformations.switchMap(searchLiveData){ query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String){
        searchLiveData.value = query
    }
}