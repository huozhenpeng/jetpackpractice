package com.example.wanandroidjetpack

import android.app.Application

class WanApplication :Application() {

    //将类中的属性定义为静态
    companion object{
        lateinit var instance:Application
    }

    override fun onCreate() {
        super.onCreate()
        instance=this
    }
}