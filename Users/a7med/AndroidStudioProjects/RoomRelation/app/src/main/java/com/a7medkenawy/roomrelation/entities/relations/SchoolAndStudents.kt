package com.a7medkenawy.roomrelation.entities.relations

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation
import com.a7medkenawy.roomrelation.entities.School
import com.a7medkenawy.roomrelation.entities.Student


data class SchoolAndStudents(

    @Embedded var school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    var student: List<Student>
)