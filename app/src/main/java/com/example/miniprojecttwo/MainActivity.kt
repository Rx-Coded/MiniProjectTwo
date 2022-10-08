package com.example.miniprojecttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var toolBar:Toolbar
    private lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.list_of_friends)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = FriendsAdapter(this)

     val decor =DividerItemDecoration(this,androidx.recyclerview.widget.RecyclerView.VERTICAL)
     recyclerView.addItemDecoration(decor)

    }
}