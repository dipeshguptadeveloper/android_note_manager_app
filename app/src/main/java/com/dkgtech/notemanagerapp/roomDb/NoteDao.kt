package com.dkgtech.notemanagerapp.roomDb


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.dkgtech.notemanagerapp.model.NoteModel

@Dao
interface NoteDao {

    @Insert
    fun addNote(newNote: NoteModel)

    @Update
    fun updateNote(note: NoteModel)

    @Delete
    fun deleteNote(note: NoteModel)

    @Query("select * from note")
    fun getAllNotes(): LiveData<List<NoteModel>>
}