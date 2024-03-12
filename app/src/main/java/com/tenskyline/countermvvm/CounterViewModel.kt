package com.tenskyline.countermvvm

import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){
    private val _count = mutableIntStateOf(0)

    //Expose the count as imumtable state
    val count: MutableIntState= _count

    fun increment() {
        _count.intValue++
    }

    fun decrement() {
        _count.intValue--
    }
}