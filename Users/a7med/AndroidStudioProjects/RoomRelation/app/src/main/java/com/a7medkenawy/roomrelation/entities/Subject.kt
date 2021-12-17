package com.a7medkenawy.roomrelation.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subject(
    @PrimaryKey(autoGenerate = false)
    var subjectName: String,
    var studentName:String
)