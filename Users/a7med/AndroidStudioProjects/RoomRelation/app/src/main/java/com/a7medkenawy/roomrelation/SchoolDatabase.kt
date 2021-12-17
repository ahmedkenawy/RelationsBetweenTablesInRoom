package com.a7medkenawy.roomrelation

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.a7medkenawy.roomrelation.entities.Director
import com.a7medkenawy.roomrelation.entities.School
import com.a7medkenawy.roomrelation.entities.Student
import com.a7medkenawy.roomrelation.entities.Subject
import com.a7medkenawy.roomrelation.entities.relations.StudentAndSubjectRef

@Database(
    entities = [
        School::class,
        Student::class,
        Subject::class,
        Director::class,
        StudentAndSubjectRef::class
    ],
    version = 1
)
abstract class SchoolDatabase : RoomDatabase() {

    abstract fun schoolDao(): SchoolDao


    companion object {

        @Volatile
        private var INSTANCE: SchoolDatabase? = null

        fun getDatabase(context: Context): SchoolDatabase {

            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    SchoolDatabase::class.java, "user_database"
                ).build()
                INSTANCE = instance
                return instance

            }
        }
    }
}