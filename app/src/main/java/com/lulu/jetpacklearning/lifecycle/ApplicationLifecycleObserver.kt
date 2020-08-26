package com.lulu.jetpacklearning.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * Application 生命周期回调
 */
private const val TAG = "ApplicationLifecycleObs"
class ApplicationLifecycleObserver: LifecycleObserver {

    /**
     * 整个生命周期调用一次
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun onCreate() {
        Log.d(TAG, "onCreate ")
    }

    /**
     * 置于前台时调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private fun onStart() {
        Log.d(TAG, "onStart ")
    }
    /**
     * 置于前台时调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private fun onResume() {
        Log.d(TAG, "onResume ")
    }
    /**
     * 置于后台时调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private fun onPause() {
        Log.d(TAG, "onPause ")
    }
    /**
     * 置于后台时调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private fun onStop() {
        Log.d(TAG, "onStop ")
    }
    /**
     * 不会调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private fun onDestroy() {
        Log.d(TAG, "onDestroy ")
    }
}