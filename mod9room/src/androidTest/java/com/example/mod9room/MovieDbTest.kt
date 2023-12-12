package com.example.mod9room

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MovieDbTest {

    lateinit var db: AppDatabase

    @Before
    fun createDb() {
        db = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            AppDatabase::class.java
        ).build()
    }

    @Test
    fun testInsertMovie() {

        val movie = Movie(
            0,
            "Pearl Harbor",
            "Michael Bay",
            Genre.HISTORY,
            2001
        )

        val id = db.movieDAO().insert(movie)

        Assert.assertTrue("Mauvais film !",
            db.movieDAO().selectById(id).title == "Pearl Harbor")

    }


}