package com.a7medkenawy.roomrelation.entities.relations

import androidx.room.Entity

@Entity(primaryKeys = ["studentName", "subjectName"])
data class StudentAndSubjectRef(
    var studentName: String,
    var subjectName: String
)