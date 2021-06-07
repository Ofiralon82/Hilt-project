package com.example.myhiltproject.dependencyInjection

import android.app.Application
import android.content.Context
import com.example.myhiltproject.App
import com.example.myhiltproject.MainActivity
import dagger.BindsInstance
import dagger.Component
//import dagger.android.AndroidInjectionModule
//import dagger.android.AndroidInjector

//@MyScope
//@Component(modules = [ZooModule::class])
//interface ZooComponent {
//
//    //old way of expose this
//    fun getLion(): Lion
//
////    fun inject(activity: MainActivity)
//}

//@MyScope
//@Component(modules = [AndroidInjectionModule::class, ActivityBindingModule::class])//(modules = [ZooModule::class, /*ActivityBindingModule::class, AndroidInjectionModule::class,*/ ])
//interface ZooComponent : AndroidInjector<App> {
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun application(application: Application): Builder
//
//        @BindsInstance
//        fun context(context: Context): Builder
//        fun build(): ZooComponent
//    }
//
//    //old way of expose this
//    fun getLion(): Lion
//
//    fun inject(activity: MainActivity)
//}