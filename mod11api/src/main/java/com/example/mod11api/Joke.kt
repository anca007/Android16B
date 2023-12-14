package com.example.mod11api

import com.squareup.moshi.Json

data class Joke(
    val id: String,
    //permet de mapper les données du JSON avec l'objet
    @Json(name = "icon_url")
    val image: String,
    @Json(name = "value")
    val content: String
)
