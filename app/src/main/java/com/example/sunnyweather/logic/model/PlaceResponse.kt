package com.example.mytext.weather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * 城市数据响应
 *
 * @author jingqingqing
 * @date 2020-09-02
 * @version v1.0.0
 *
 */
data class PlaceResponse(val status: String, val places: List<Place>)

class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)