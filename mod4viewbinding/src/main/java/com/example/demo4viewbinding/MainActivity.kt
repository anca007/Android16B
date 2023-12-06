package com.example.demo4viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo4viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEditName.setOnClickListener {
            binding.tvName.text = binding.etName.text.toString()
        }
    }
}