package com.dkgtech.notemanagerapp.screens.dashboard.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dkgtech.notemanagerapp.repo.NoteRepo

class DashboardViewModelFactory(val noteRepo: NoteRepo) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DashboardViewModel(noteRepo) as T
    }
}