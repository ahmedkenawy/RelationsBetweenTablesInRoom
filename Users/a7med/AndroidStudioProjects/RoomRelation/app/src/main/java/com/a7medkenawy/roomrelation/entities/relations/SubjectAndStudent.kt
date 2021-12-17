package com.a7medkenawy.roomrelation.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.a7medkenawy.roomrelation.entities.Student
import com.a7medkenawy.roomrelation.entities.Subject

data class SubjectAndStudent(
    @Embedded var subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentAndSubjectRef::class)
    )
    var student: List<Student>
)