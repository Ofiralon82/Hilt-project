package com.example.myhiltproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.myhiltproject.objects.Food
import com.example.myhiltproject.objects.LionCage
import com.example.myhiltproject.objects.Zoo
import com.example.myhiltproject.viewmodel.ZooViewModel
import dagger.hilt.android.AndroidEntryPoint
//import dagger.android.AndroidInjection
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val zooViewModel: ZooViewModel by viewModels()

    @Inject
    lateinit var lionCage: LionCage

    @Inject
    lateinit var zoo: Zoo

    @Inject
    lateinit var food: Food

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        zoo.test()
        zooViewModel.testApi()
    }
}