package com.example.mod8viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var cpt = MutableLiveData<Int>(0)
    fun increment() {
        cpt.value = cpt.value?.inc()
    }
}