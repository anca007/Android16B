package com.example.mod9room

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieViewModel(private val movieDAO: MovieDAO) : ViewModel() {

    var movie: MutableLiveData<Movie> = MutableLiveData<Movie>()

    fun addMovie(movie: Movie): MutableLiveData<Long> {
        val id = MutableLiveData<Long>()

        viewModelScope.launch(Dispatchers.IO) {
           id.postValue(movieDAO.insert(movie))
        }

        return id
    }

    fun getMovie(id :Long){
        viewModelScope.launch(Dispatchers.IO) {
            movie.postValue(movieDAO.selectById(id))
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                // Get the Application object from extras
                val application = checkNotNull(extras[APPLICATION_KEY])

                return MovieViewModel(
                    AppDatabase.getInstance(application.applicationContext).movieDAO()
                ) as T
            }
        }

    }

}