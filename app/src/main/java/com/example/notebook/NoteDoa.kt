package com.example.notebook

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDoa {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("Select * from notes_table order by id ASC")
    fun getAllNotes(): LiveData<List<Note>>
}