package com.example.testgithubbot

import android.app.Application

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        DiDependencies.init(this)
    }
}