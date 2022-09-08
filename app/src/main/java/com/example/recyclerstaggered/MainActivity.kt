package com.example.recyclerstaggered

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var list: List<Model>
    private lateinit var adapter: RecyclerAdapter
    private lateinit var manager: StaggeredGridLayoutManager
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerview)
        list=listOf(
            Model(R.drawable.ic_launcher_background),
            Model(R.drawable.profile),
            Model(R.drawable.ic_launcher_background),
            Model(R.drawable.ic_launcher_foreground),
            Model(R.drawable.profile),
            Model(R.drawable.ic_launcher_background),
            Model(R.drawable.ic_launcher_foreground),
            Model(R.drawable.ic_launcher_foreground),
            Model(R.drawable.profile),
            Model(R.drawable.ic_launcher_foreground),
            Model(R.drawable.ic_launcher_background),
            Model(R.drawable.profile),
            Model(R.drawable.ic_launcher_foreground),
            Model(R.drawable.profile),
            Model(R.drawable.profile),
            Model(R.drawable.ic_launcher_background),
            Model(R.drawable.ic_launcher_background),
            Model(R.drawable.profile),
            Model(R.drawable.ic_launcher_background),
            Model(R.drawable.ic_launcher_foreground),
            Model(R.drawable.profile),
            Model(R.drawable.ic_launcher_background),
            Model(R.drawable.ic_launcher_foreground),
            Model(R.drawable.ic_launcher_foreground),
            Model(R.drawable.profile),
            Model(R.drawable.ic_launcher_foreground),
            Model(R.drawable.ic_launcher_background),
            Model(R.drawable.profile),
            Model(R.drawable.ic_launcher_foreground),
            Model(R.drawable.profile),
            Model(R.drawable.profile),
            Model(R.drawable.ic_launcher_background)
        )
        adapter=RecyclerAdapter(list)
        manager= StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        manager.gapStrategy= StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS
        recyclerView.adapter=adapter
        recyclerView.layoutManager=manager
    }
}