package com.example.lessonrecylerview

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessonrecylerview.databinding.ActivityTextBinding

class TextActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var binding: ActivityTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("hab", MODE_PRIVATE)
        val string = sharedPreferences.getString("ja", "")
        val string1 = sharedPreferences.getString("j", "")
        val string2 = sharedPreferences.getString("jq", "")
        val string3 = sharedPreferences.getString("js", "")
        binding.txt.text = string
        binding.txt2.text = string1
        binding.txt3.text = string2
        binding.tzt.text = string3
    }
}