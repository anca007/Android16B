package com.example.mod11api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface JokeService {
    companion object {

        val BASE_URL = "https://api.chucknorris.io/jokes/"

        //création de l'instance de Moshi qui converti le JSON en objet Kotlin
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

        //création de l'instance de Retrofit qui permet de lancer des appels aux Api
        val retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(BASE_URL)
            .build()
    }

    @GET("random")
    suspend fun randomFact() : Joke

    //pour passer des paramètres
    @GET("{code}")
    suspend fun getJokeById(@Path("code") code : String) : Joke

    //pour passer un body à votre requête
    @POST("add")
    suspend fun addJoke(@Body joke : Joke)


    object JokeApi{
        val retrofitService : JokeService by lazy { retrofit.create(JokeService::class.java) }
    }


}