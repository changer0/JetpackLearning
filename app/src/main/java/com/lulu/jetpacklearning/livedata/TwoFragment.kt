package com.lulu.jetpacklearning.livedata

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lulu.jetpacklearning.R
import kotlinx.android.synthetic.main.live_data_fragment.*

class TwoFragment : Fragment() {

    companion object {
        fun newInstance() = TwoFragment()
    }

    private lateinit var viewModel: ShareDataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.live_data_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(activity!!).get(ShareDataViewModel::class.java)
        text.text = "TwoFragment"

        val process = viewModel.getProcess()
        process?.observe(viewLifecycleOwner, Observer {
            seekBar.progress = it
        })
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                process?.postValue(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })
    }

}