package com.example.mod8viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.mod8viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vm: CounterViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        vm = ViewModelProvider(this)[CounterViewModel::class.java]
        //vm = ViewModelProvider(this).get(CounterViewModel::class.java)

        vm.cpt.observe(this) {
            binding.vm = vm
        }
        //autre écriture
//        binding.vm = vm
//        binding.lifecycleOwner = this


        findViewById<Button>(R.id.button).setOnClickListener {
            vm.increment()
        }

    }
}