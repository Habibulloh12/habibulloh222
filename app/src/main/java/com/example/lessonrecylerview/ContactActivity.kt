package com.example.lessonrecylerview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lessonrecylerview.adapters.ContactAdapter
import com.example.lessonrecylerview.databinding.ActivityContactBinding
import com.example.lessonrecylerview.models.Contact

class ContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityContactBinding
    lateinit var list: ArrayList<Contact>
    lateinit var contactAdapter: ContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList()
        contactAdapter = ContactAdapter(list, object : ContactAdapter.ContactService {
            override fun myClickListener(position: Int) {
                contactAdapter.notifyItemRangeChanged(position, list.size)
                val intent = Intent(this@ContactActivity,TextActivity::class.java)
                startActivity(intent)
            }
        })
        binding.rv.adapter = contactAdapter
//        binding.btn.setOnClickListener {
//            val name = binding.name.text.toString()
//            val number = binding.number.text.toString()
//            list.add(Contact(name, number))
//            contactAdapter.notifyItemInserted(list.size)
    }
}