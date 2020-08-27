package com.lulu.jetpacklearning.viewmodel

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lulu.jetpacklearning.R
import kotlinx.android.synthetic.main.activity_view_model.*

/**
 * ViewModel 用来存放页面数据
 * 介于 View 和 Model 之间的东西
 */
class ViewModelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR
        setContentView(R.layout.activity_view_model)

        val timerViewModel = ViewModelProvider(this).get(TimerViewModel::class.java)
        timerViewModel.startTiming()
        timerViewModel.currentSecond.observe(this, Observer {
            tvTime.text = it.toString()
        })
    }
}