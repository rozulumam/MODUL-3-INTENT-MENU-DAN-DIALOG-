package com.example.myhome.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "full_name") var fullName: String?,
    @ColumnInfo(name = "email") var email: String?,
)