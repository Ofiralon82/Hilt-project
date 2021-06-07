package com.example.myhiltproject.objects

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class Lion @Inject constructor()   {

    fun lionSound(): String {
        return "ahhhhhhh"
    }
}