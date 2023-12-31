package com.example.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Movie::class], version = 1)
abstract class AppDatabase : RoomDatabase (){

    //liste des daos
    abstract fun movieDAO() : MovieDAO
    companion object{

        private var INSTANCE : AppDatabase? = null

        fun getInstance(context : Context) : AppDatabase{

            var instance = INSTANCE

            if(instance == null){

                instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "movies"
                ).fallbackToDestructiveMigration().build()

                INSTANCE = instance
            }

            return instance
        }
    }



}