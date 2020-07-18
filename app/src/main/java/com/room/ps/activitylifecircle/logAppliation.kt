package com.room.ps.activitylifecircle

import android.app.Application
import timber.log.Timber

class logApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}