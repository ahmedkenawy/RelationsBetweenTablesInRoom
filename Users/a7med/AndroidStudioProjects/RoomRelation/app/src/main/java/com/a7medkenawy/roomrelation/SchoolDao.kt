package com.a7medkenawy.roomrelation

import androidx.room.*
import com.a7medkenawy.roomrelation.entities.Director
import com.a7medkenawy.roomrelation.entities.School
import com.a7medkenawy.roomrelation.entities.Student
import com.a7medkenawy.roomrelation.entities.Subject
import com.a7medkenawy.roomrelation.entities.relations.SchoolAndDirectors
import com.a7medkenawy.roomrelation.entities.relations.SchoolAndStudents
import com.a7medkenawy.roomrelation.entities.relations.StudentAndSubject

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Transaction
    @Query("select schoolName  from school where schoolName = :schoolName")
    suspend fun getSchoolAndDirectorsWithSchoolName(schoolName: String): List<SchoolAndDirectors>


    @Transaction
    @Query("select schoolName  from school where schoolName = :schoolName")
    suspend fun getSchoolAndStudentsWithSchoolName(schoolName: String): List<SchoolAndStudents>

    @Transaction
    @Query("select schoolName  from student where studentName = :studentName")
    suspend fun getStudentAndSubjectWithStudentName(studentName: String): List<StudentAndSubject>
}