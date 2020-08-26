package com.lulu.jetpacklearning.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lulu.jetpacklearning.R

class LifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        lifecycle.addObserver(LifecycleListener())
    }
}