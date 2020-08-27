package com.lulu.jetpacklearning.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lulu.jetpacklearning.R
import kotlinx.android.synthetic.main.activity_life_cycle.*

/**
 * Lifecycle 用于解决普通组件对系统组件生命周期的监听
 */
class LifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        lifecycle.addObserver(LifecycleActivityObserver(tvContent))
    }
}