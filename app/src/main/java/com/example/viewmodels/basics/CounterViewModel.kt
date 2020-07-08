package com.example.viewmodels.basics

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var count = 0

    fun getIncrementedCount(): Int{
        this.count ++
        return this.count
    }
}