package com.lulu.jetpacklearning.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

/**
 * @author zhanglulu on 2020/8/27.
 * for
 */
class TimerViewModel: ViewModel() {

    private var timer: Timer? = null

    public var currentSecond = MutableLiveData<Int>()

    /**
     * 启动计时
     */
    public fun startTiming() {
        if (timer == null) {
            currentSecond.value = 0
            timer = Timer()
            val timerTask = object: TimerTask() {
                override fun run() {
                    currentSecond.postValue(currentSecond.value!! +1)
                }
            }
            timer?.schedule(timerTask, 1000, 1000)
        }
    }

    /**
     * 与之相关的组件销毁时调用
     */
    override fun onCleared() {
        super.onCleared()
        timer?.cancel()
    }
}