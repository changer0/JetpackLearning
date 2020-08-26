package com.lulu.jetpacklearning.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lulu.jetpacklearning.R
import kotlinx.android.synthetic.main.activity_life_cycle.*

class LifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        lifecycle.addObserver(LifecycleActivityObserver(tvContent))
    }
}