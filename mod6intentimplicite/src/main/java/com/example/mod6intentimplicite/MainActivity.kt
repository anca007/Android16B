package com.example.mod6intentimplicite

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:47.47,-0.563"))
        //startActivity(intent)

        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:0606060606"))
        startActivity(intent)

    }
}