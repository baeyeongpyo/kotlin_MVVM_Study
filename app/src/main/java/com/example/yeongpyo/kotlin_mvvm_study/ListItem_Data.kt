package com.example.yeongpyo.kotlin_mvvm_study

import android.content.Context
import android.databinding.BaseObservable
import android.databinding.ObservableField
import android.widget.Toast

class ListItem_Data( name : String, value : String) : BaseObservable(){
    var name = ObservableField<String>(name)
    var value = ObservableField<String>(value)

}