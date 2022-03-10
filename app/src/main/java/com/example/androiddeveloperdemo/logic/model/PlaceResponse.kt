package com.example.androiddeveloperdemo.logic.model

import android.location.Address
import android.location.Location
import android.telephony.cdma.CdmaCellLocation
import com.google.gson.annotations.SerializedName



data class PlaceResponse(val status: String , val places : List<Place>)

//@SerializedName 让JSON字段和Kotlin字段之间建立映射关系
data class Place(val name : String,val  location: Location,
                     @SerializedName("formatted_address") val address: String)

data class Location(val lng:String,val lat:String)

