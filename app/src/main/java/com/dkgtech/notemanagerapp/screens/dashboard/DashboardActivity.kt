package com.dkgtech.notemanagerapp.screens.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.dkgtech.notemanagerapp.R
import com.dkgtech.notemanagerapp.databinding.ActivityDashboardBinding
import com.dkgtech.notemanagerapp.model.NoteModel
import com.dkgtech.notemanagerapp.repo.NoteRepo
import com.dkgtech.notemanagerapp.roomDb.AppDatabase
import com.dkgtech.notemanagerapp.screens.dashboard.viewModel.DashboardViewModel
import com.dkgtech.notemanagerapp.screens.dashboard.viewModel.DashboardViewModelFactory

class DashboardActivity : AppCompatActivity() {
    lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val appDb = AppDatabase.getDatabase(this@DashboardActivity)

        val noteRepo = NoteRepo(appDb.NoteDao())

//        val dashboardViewModel = DashboardViewModel(noteRepo)

        val dashboardViewModel = ViewModelProvider(
            this@DashboardActivity,
            DashboardViewModelFactory(noteRepo)
        )[DashboardViewModel::class.java]

        dashboardViewModel.getAllNotes().observe(this@DashboardActivity){

        }

    }
}