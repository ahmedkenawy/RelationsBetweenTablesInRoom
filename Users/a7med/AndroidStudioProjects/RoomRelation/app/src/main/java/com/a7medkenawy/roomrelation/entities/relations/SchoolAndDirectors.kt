package com.a7medkenawy.roomrelation.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.a7medkenawy.roomrelation.entities.Director
import com.a7medkenawy.roomrelation.entities.School

data class SchoolAndDirectors (

    @Embedded var school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    var director: Director
        )