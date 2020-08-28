package com.lulu.jetpacklearning.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author zhanglulu on 2020/8/28.
 * for
 */
class ShareDataViewModel: ViewModel() {
    private var process: MutableLiveData<Int>? = null

    public fun getProcess():MutableLiveData<Int>? {
        if (process == null) {
            process = MutableLiveData()
        }
        return process
    }

    override fun onCleared() {
        super.onCleared()
        process = null
    }
}