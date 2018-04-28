package com.example.yeongpyo.kotlin_mvvm_study

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.yeongpyo.kotlin_mvvm_study.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        Binding.datastring = ("Test Code")
        Binding.datastringButton = BindingChangbutton()

    }
}
