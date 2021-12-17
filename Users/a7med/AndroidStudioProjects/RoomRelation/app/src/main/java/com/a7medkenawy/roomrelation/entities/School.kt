package com.a7medkenawy.roomrelation.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class School(
    @PrimaryKey(autoGenerate = false)
    var schoolName:String
)