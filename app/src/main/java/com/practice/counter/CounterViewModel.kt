package com.practice.counter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _count = mutableStateOf(0)

    val count : MutableState<Int> = _count

    fun increase(){
        _count.value++
    }
    fun decrease(){
        _count.value--
    }
}