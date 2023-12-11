package com.example.mod8tpdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mod8tpdice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var vm : DiceViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        vm = ViewModelProvider(this)[DiceViewModel::class.java]

        binding.vm = vm
        //binding.lifecycleOwner = this

        vm.nbDice.observe(this){
            binding.vm = vm
        }

        binding.buttonLeft.setOnClickListener {
            vm.launchLeft()
        }

        binding.buttonRight.setOnClickListener {
            vm.launchRight()
        }


    }
}