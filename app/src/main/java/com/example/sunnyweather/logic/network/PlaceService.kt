package com.example.mytext.weather.logic.network

import com.example.mytext.weather.logic.model.PlaceResponse
import com.example.sunnyweather.SunnyWeatherApplication
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 城市服务
 *
 * @author jingqingqing
 * @date 2020/9/7
 * @ver v1.0.0
 */
interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String) : Call<PlaceResponse>
}