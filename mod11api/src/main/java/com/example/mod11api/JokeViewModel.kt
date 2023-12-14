package com.example.mod11api

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class JokeViewModel : ViewModel() {

    val joke = MutableLiveData<Joke>()

    fun getRandomJoke(): MutableLiveData<Joke> {
        viewModelScope.launch {
            joke.value = JokeService.JokeApi.retrofitService.randomFact()
        }

        return joke
    }

}