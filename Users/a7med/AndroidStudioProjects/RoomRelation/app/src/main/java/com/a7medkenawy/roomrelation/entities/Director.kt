package com.a7medkenawy.roomrelation.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Director(
    @PrimaryKey(autoGenerate = false)
    var directorName:String
)