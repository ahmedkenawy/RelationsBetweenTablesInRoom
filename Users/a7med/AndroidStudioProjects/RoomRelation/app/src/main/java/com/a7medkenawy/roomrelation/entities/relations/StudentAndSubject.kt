package com.a7medkenawy.roomrelation.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.a7medkenawy.roomrelation.entities.Student
import com.a7medkenawy.roomrelation.entities.Subject

data class StudentAndSubject(
    @Embedded var student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentAndSubjectRef::class)
    )
    var subject: List<Subject>
)