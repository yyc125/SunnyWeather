package com.sanki.sunnyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication :Application(){
    companion object{
        lateinit var context:Context
        const val TOKEN="cQ7CF2QnDUzV4Jd2"
    }
    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}