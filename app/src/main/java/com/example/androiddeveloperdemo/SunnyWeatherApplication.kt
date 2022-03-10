package com.example.androiddeveloperdemo

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object{
        const val TOKEN = ""//填入申请的令牌值
        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext//全局调用context
    }
}