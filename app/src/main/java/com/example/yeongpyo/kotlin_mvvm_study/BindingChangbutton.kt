package com.example.yeongpyo.kotlin_mvvm_study

import android.databinding.BaseObservable
import android.databinding.ObservableField

class BindingChangbutton : BaseObservable() {

    var Change = ObservableField<String>("")

    fun ButtonClick(text : String){
        Change.set("button click $text")
    }

    fun ButtonClick(num : Int){
        Change.set("button click $num")
    }

}