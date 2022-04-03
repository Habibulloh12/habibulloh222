package com.example.lessonrecylerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessonrecylerview.databinding.ActivityRoyhatBinding

class RoyhatActivity : AppCompatActivity() {
    lateinit var binding: ActivityRoyhatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoyhatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.card1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        binding.card2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}