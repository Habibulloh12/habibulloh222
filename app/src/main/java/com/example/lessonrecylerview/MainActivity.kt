package com.example.lessonrecylerview

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lessonrecylerview.adapters.ContactAdapter
import com.example.lessonrecylerview.adapters.NewsAdapter
import com.example.lessonrecylerview.adapters.User
import com.example.lessonrecylerview.databinding.ActivityMainBinding
import com.example.lessonrecylerview.models.News
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    lateinit var gson: Gson
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor
    lateinit var newsAdapter: NewsAdapter
    lateinit var contactAdapter: ContactAdapter
    lateinit var binding: ActivityMainBinding
    lateinit var list: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setData()
        newsAdapter = NewsAdapter(list)
        binding.add.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
//        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true)
        val gridLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        val staggeredGridLayoutManager =
//            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.rv.adapter = newsAdapter
        binding.rv.layoutManager = gridLayoutManager
        binding.rv.setOnClickListener {
//            val intent = Intent(this, TextActivity::class.java)
//            startActivity(intent)
//        }
        }
    }
}