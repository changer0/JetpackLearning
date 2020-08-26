package com.lulu.jetpacklearning

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import com.lulu.jetpacklearning.lifecycle.ApplicationLifecycleObserver

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(ApplicationLifecycleObserver())
    }
}