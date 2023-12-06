package com.example.mod4tprandom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mod4tprandom.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

            var minInt: Int? = binding.etMin.text.toString().toIntOrNull()
            var maxInt: Int? = binding.etMax.text.toString().toIntOrNull()

            if (minInt != null && maxInt != null && minInt < maxInt) {
                var rdNumber = (minInt..maxInt).random()
                binding.tvResult.text = "Résultat : " + rdNumber
            } else {
                Snackbar.make(it, "Une erreur s'est produite !", Snackbar.LENGTH_SHORT).show()
            }
        }


    }
}