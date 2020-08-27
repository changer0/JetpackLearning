package com.lulu.jetpacklearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lulu.jetpacklearning.lifecycle.LifecycleActivity
import com.lulu.jetpacklearning.viewmodel.ViewModelActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goLifeCycleActivity.setOnClickListener {
            startActivity(Intent(this, LifecycleActivity::class.java))
        }
        goViewModelActivity.setOnClickListener {
            startActivity(Intent(this, ViewModelActivity::class.java))
        }
    }
}