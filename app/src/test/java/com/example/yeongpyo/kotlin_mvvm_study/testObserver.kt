package com.example.yeongpyo.kotlin_mvvm_study

import android.databinding.ObservableField
import java.util.*

class testObserver() : ObservableField<String>() {
    var inittext : String? = null

    override fun notifyChange() {
        super.notifyChange()
        println("updata Text : $inittext")
    }

    override fun set(value: String?) {
        super.set(value)
    }


}