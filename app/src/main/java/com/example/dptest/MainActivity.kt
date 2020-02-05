package com.example.dptest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val recyclerView = findViewById<RecyclerView>(R.id.rv_activity_main)
        val adapter = DpTestAdapter(object : DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }
        })
        recyclerView.adapter = adapter
        val list = ArrayList<String>()
        for (i in 1..99) {
            list.add("")
        }
        adapter.submitList(list)

    }
}
