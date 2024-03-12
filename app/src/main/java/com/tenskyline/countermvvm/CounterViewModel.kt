package com.tenskyline.countermvvm

import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel(){
    private val _repository: CounterRepository = CounterRepository()
    private val _count = mutableIntStateOf(_repository.getCounter().count)

    //Expose the count as imumtable state
    val count: MutableIntState= _count

    fun increment() {
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrement() {
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }
}