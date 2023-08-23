package com.example.todolist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class myAdapter(val context:Context, val list:ArrayList<chatModel>):BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
       return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.listed2_image, null)

        val name = view.findViewById<TextView>(R.id.name)
        val message = view.findViewById<TextView>(R.id.message)
        val date = view.findViewById<TextView>(R.id.date)
        val image = view.findViewById<ImageView>(R.id.imageView)

         name.text = list[p0].name
        message.text = list[p0].message
        date.text = list[p0].date

        image.setImageResource(list[p0].image)

        return  view
    }
}