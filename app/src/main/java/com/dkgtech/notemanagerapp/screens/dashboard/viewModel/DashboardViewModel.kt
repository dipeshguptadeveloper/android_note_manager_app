package com.dkgtech.notemanagerapp.screens.dashboard.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dkgtech.notemanagerapp.model.NoteModel
import com.dkgtech.notemanagerapp.repo.NoteRepo

class DashboardViewModel(val noteRepo: NoteRepo) : ViewModel() {

    fun getAllNotes(): LiveData<List<NoteModel>> {
        return noteRepo.getAllNotes()
    }

    fun deleteNote(note: NoteModel) {
        noteRepo.deleteNote(note)
    }

    fun updateNote(note: NoteModel) {
        noteRepo.updateNote(note)
    }

}