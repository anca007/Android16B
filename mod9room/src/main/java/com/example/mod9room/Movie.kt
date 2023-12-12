package com.example.mod9room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
enum class Genre {
    SF, WESTERN, FANTASY, KOREAN, HORROR, HISTORY
}
@Entity
data class Movie(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    @ColumnInfo("name")
    var title: String,
    var director: String,
    var genre: Genre,
    var year: Int
)
