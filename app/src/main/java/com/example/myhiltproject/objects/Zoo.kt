package com.example.myhiltproject.objects

import javax.inject.Inject

class Zoo @Inject constructor(val lion: Lion) {

    fun test() {
        lion.lionSound()
    }
}