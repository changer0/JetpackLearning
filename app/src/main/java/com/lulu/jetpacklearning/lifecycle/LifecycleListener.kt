package com.lulu.jetpacklearning.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @author zhanglulu on 2020/8/26.
 * for 一个 lifecycle 的观察者
 */
private const val TAG = "LifecycleListener"
class LifecycleListener: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onActivityCreate() {
        Log.d(TAG, "onActivityCreate: ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onActivityResume() {
        Log.d(TAG, "onActivityResume: ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onActivityPause() {
        Log.d(TAG, "onActivityPause: ")
    }
}