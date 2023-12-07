package com.example.mod6intentexplicite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {

            Intent(this, TargetActivity::class.java).also {
                it.putExtra("temperature", 28)
                startActivity(it)
            }

            //val intent = Intent(this, TargetActivity::class.java)

        }


    }
}