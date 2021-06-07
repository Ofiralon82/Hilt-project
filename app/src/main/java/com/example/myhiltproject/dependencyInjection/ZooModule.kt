package com.example.myhiltproject.dependencyInjection

import com.example.myhiltproject.objects.Food
import com.example.myhiltproject.objects.LionCage
import com.example.myhiltproject.objects.Meat
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ZooModule {

//    @Provides
//    fun getLion() = Lion()
    
    @Binds
    abstract fun food(meat: Meat): Food

    companion object {
        @Provides
        fun getLionCage() = LionCage()
    }
}