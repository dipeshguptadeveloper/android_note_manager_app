package com.dkgtech.notemanagerapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class NoteModel(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "note_title") val title: String,
    @ColumnInfo(name = "note_desc") val desc: String
)
