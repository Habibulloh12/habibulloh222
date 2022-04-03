package com.example.lessonrecylerview

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessonrecylerview.adapters.User
import com.example.lessonrecylerview.databinding.ActivitySecondBinding
import com.google.gson.Gson

class SecondActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor
    lateinit var gson: Gson
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        gson = Gson()

        binding.saqlash.setOnClickListener {
            val txt1 = binding.txt3.text.toString()
            val txt3 = binding.txt.text.toString()
            val txt2 = binding.txt2.text.toString()
            sharedPreferences = getSharedPreferences("hab", MODE_PRIVATE)
            editor = sharedPreferences.edit()
            val tzt = binding.tzt.text.toString()
            editor.putString("ja",txt1)
            editor.putString("j",txt2)
            editor.putString("jq",txt3)
            editor.putString("js",tzt)
            editor.commit()
        }
    }
}