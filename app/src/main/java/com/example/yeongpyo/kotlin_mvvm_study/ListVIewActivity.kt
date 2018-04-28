package com.example.yeongpyo.kotlin_mvvm_study

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yeongpyo.kotlin_mvvm_study.databinding.ListitemBinding
import kotlinx.android.synthetic.main.activity_list_view.*
import java.util.*

class ListVIewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var list : ArrayList<ListItem_Data> = ArrayList()
        list.apply {
            add(ListItem_Data("aa", "bb"))
            add(ListItem_Data("aab", "bba"))
            add(ListItem_Data("aac", "bbb"))
            add(ListItem_Data("aad", "bbd"))
        }
        rcview.adapter = customAdapter(list, applicationContext)
        rcview.layoutManager = LinearLayoutManager(this)
    }

    inner class customAdapter(Items : ArrayList<ListItem_Data>, context : Context) : RecyclerView.Adapter<customAdapter.customHoler>() {
       var items = Items
       var context = context

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): customHoler
                = customHoler(LayoutInflater.from(parent.context).inflate(R.layout.listitem, parent, false))

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: customAdapter.customHoler, position: Int) {
            holder.binding.bindingData = items.get(position)
        }

        inner class customHoler(itemView: View?) : RecyclerView.ViewHolder(itemView) {
            var binding : ListitemBinding = DataBindingUtil.bind(itemView!!)!!
        }
    }
}
