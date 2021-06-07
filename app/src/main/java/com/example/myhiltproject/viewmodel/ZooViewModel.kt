package com.example.myhiltproject.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ZooViewModel @Inject constructor(): ViewModel() {

    init {
        val one = 1
        var two = 2
    }

    fun testApi() {

    }
}