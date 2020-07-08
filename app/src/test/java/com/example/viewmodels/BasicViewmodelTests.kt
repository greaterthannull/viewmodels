package com.example.viewmodels

import com.example.viewmodels.basics.CounterViewModel
import org.junit.Test

import org.junit.Assert.*

class BasicViewmodelTests {

    @Test
    fun testViewModel() {
        val viewModel = CounterViewModel()

        assert(viewModel.count == 0)

        assert(viewModel.getIncrementedCount() == 1)

        assert(viewModel.getIncrementedCount() != 3)
    }
}