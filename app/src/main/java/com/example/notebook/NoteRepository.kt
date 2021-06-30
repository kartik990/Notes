package com.example.notebook

import androidx.lifecycle.LiveData


class NoteRepository(private val noteDoa: NoteDoa){

    val allNotes : LiveData<List<Note>> = noteDoa.getAllNotes()

    suspend fun insert(note : Note){
        noteDoa.insert(note)
    }

    suspend fun delete(note: Note){
        noteDoa.delete(note)
    }

}