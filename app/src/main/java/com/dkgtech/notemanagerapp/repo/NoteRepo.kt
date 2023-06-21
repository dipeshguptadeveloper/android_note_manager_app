package com.dkgtech.notemanagerapp.repo

import androidx.lifecycle.LiveData
import com.dkgtech.notemanagerapp.model.NoteModel
import com.dkgtech.notemanagerapp.roomDb.NoteDao

class NoteRepo(val dao: NoteDao) {

    fun addNote(newNote: NoteModel) {
        dao.addNote(newNote)
    }

    fun updateNote(note: NoteModel) {
        dao.updateNote(note)
    }

    fun deleteNote(note: NoteModel) {
        dao.deleteNote(note)
    }

    fun getAllNotes(): LiveData<List<NoteModel>> {
        return dao.getAllNotes()
    }
}