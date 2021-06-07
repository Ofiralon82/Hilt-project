package com.example.myhiltproject.objects

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

interface Food {
    fun eat()
}

class Meat @Inject constructor(): Food {
    override fun eat() {
        Log.v("eating", "meat")
    }
}