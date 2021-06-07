package com.example.myhiltproject

import android.app.Application
import android.content.Context
//import com.example.myhiltproject.dependencyInjection.DaggerZooComponent
//import com.example.myhiltproject.dependencyInjection.ZooComponent
import dagger.hilt.android.HiltAndroidApp

//import dagger.android.AndroidInjector
//import dagger.android.support.DaggerApplication

@HiltAndroidApp
class App : Application()/*: DaggerApplication()*/ {

    /* dagger */
//    private val applicationInjector = DaggerZooComponent.builder()
//        .application(this)
//        .context(this)
//        .build()
//
//    override fun applicationInjector() = applicationInjector


}