package com.example.viewmodels.basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodels.R
import kotlinx.android.synthetic.main.activity_main.*

class CounterActivity : AppCompatActivity() {

    lateinit var counterView: TextView
    lateinit var viewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(CounterViewModel::class.java)

        counterView = counter
        counter.text = "${viewModel.count}"
    }

    fun incrementCounter(view: View){
        counter.text = "${viewModel.getIncrementedCount()}"
    }
}