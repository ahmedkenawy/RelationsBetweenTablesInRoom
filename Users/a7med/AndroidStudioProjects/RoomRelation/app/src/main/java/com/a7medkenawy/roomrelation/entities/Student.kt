package com.a7medkenawy.roomrelation.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(
    @PrimaryKey(autoGenerate = false)
    var studentName: String,
    var semester: Int,
    var schoolName: String
)