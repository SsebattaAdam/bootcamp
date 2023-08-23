package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        val mylist = binding.myList
//        val countryList = listOf("ug","keny", "adam", "ug","keny", "adam")
//
//        val arrayAdaptor = ArrayAdapter(this, R.layout.list_itme_layout, R.id.textView, countryList)
//
//        mylist.adapter = arrayAdaptor
        val list= ArrayList<chatModel>()

        list.add(chatModel(R.drawable.ic_launcher_foreground, "adam osvcar", "hello world", "today"))
        list.add(chatModel(R.drawable.ic_launcher_foreground, " osvcar", "hello world", "today"))
        list.add(chatModel(R.drawable.ic_launcher_foreground, "adamr", "hello world", "today"))
        list.add(chatModel(R.drawable.ic_launcher_foreground, "bell", "hello world", "today"))
        list.add(chatModel(R.drawable.ic_launcher_foreground, "bellara", "hello world", "today"))
        list.add(chatModel(R.drawable.ic_launcher_foreground, "aman", "hello world", "today"))
        list.add(chatModel(R.drawable.ic_launcher_foreground, "jescar", "hello world", "today"))


        val myAdapter = myAdapter(this, list)


        binding.myList.adapter = myAdapter
    }
}