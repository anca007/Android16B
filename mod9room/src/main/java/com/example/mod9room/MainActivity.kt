package com.example.mod9room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    val vm: MovieViewModel by viewModels { MovieViewModel.Factory }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val movie = Movie(
            0,
            "E.T",
            "Steven Spielberg",
            Genre.SF,
            1982
        )

        vm.addMovie(movie).observe(this) {
            Log.i(TAG, "Id du film créé $it")
            //récupération du film que l'on vient de créer
            vm.getMovie(it)
            vm.movie.observe(this) { movie ->
                Log.i(TAG, movie.toString())
            }
        }

        Log.i(TAG, "onCreate: Coucoucoucou")


    }
}