package com.lulu.jetpacklearning.lifecycle

import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @author zhanglulu on 2020/8/26.
 * for 一个 lifecycle 的观察者
 */
private const val TAG = "LifecycleTestClazz"
class LifecycleTestClazz(val tvContent: TextView): LifecycleObserver {
    val loggerStr = StringBuilder()
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onActivityCreate() {
        Log.d(TAG, "onActivityCreate: ")
        loggerStr.append("onActivityCreate\n")
        refresh()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onActivityResume() {
        Log.d(TAG, "onActivityResume: ")
        loggerStr.append("onActivityResume\n")
        refresh()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onActivityPause() {
        Log.d(TAG, "onActivityPause: ")
        loggerStr.append("onActivityPause\n")
        refresh()
    }

    private fun refresh() {
        tvContent.text = loggerStr.toString()
    }
}