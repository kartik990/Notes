package com.example.notebook

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note(
    @ColumnInfo(name = "text")
    var text: String)
{
    @PrimaryKey(autoGenerate = true) var id : Int? = null
}