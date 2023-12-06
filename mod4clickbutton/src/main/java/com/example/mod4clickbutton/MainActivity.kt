package com.example.mod4clickbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val tv = findViewById<TextView>(R.id.tv_state_save)

        button.setOnClickListener {
            tv.text = "C'est cliqué !"
            Snackbar.make(it, "J'ai cliqué sur le bouton !", Snackbar.LENGTH_LONG).show()
        }

        button.setOnLongClickListener {
            Toast.makeText(this, "J'ai cliqué longtemps", Toast.LENGTH_SHORT).show()
            return@setOnLongClickListener true
        }











    }
}