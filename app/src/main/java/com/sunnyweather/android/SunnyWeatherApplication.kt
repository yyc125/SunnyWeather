package com.sunnyweather.android

import android.app.Application
import android.content.Context

/**
Create by yyc
on 2020/9/1 16:10

 */
class SunnyWeatherApplication :Application(){

    companion object{
        const val TOKEN="你的token"
        lateinit var context: Context

    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }

}