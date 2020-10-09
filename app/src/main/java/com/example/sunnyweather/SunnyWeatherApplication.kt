package com.example.sunnyweather

import android.app.Application
import android.content.Context


/**
 * 应用入口
 *
 * @author jingqingqing
 * @date 2020-09-02
 * @version v1.0.0
 */
class SunnyWeatherApplication : Application() {

     companion object {
         // 申请到的令牌值
         const val TOKEN = "oJLc7KBhHpwMEbJ5"

         lateinit var context: Context
     }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
