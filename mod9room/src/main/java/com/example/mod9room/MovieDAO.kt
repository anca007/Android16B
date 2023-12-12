package com.example.mod9room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface MovieDAO {
    @Insert
    fun insert(movie: Movie): Long
    @Update
    fun update(movie: Movie)
    @Delete
    fun delete(movie: Movie)

    @Query("SELECT * FROM Movie WHERE id = :id")
    fun selectById(id : Long): Movie


}