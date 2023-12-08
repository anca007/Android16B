package com.example.mod7democycledevie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var cpt = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.tv_count).text = (++cpt).toString()
        }


    }
}