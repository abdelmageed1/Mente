package com.example.mente.Student.StudentViewModel

import androidx.lifecycle.ViewModel
import com.example.mente.Models.Quiz
import com.example.mente.Student.Repo.RepoStudent
import com.example.mente.Student.Model.Student

class StudentViewModel : ViewModel() {

    var studentRepo = RepoStudent.getInstance()
    var mAddStudentSuccess = studentRepo.addedStudentSuccess
    var mAddStudentFailure = studentRepo.addedStudentFailure

    var mSetQuizSuccess = studentRepo.mSetQuizSuccess
    var mSetQuizFailure = studentRepo.mSetQuizFailure


    fun addNewStudent(student: Student) {

        studentRepo.addStudentInfo(student)

    }

    fun getStudent ()
    {
        studentRepo.getStudentInSpecialist()
    }

    fun setQuizValue(quiz: Quiz, student :Student){
        studentRepo.setQuizResult(quiz , student )
    }






    fun getMutableStudents() = studentRepo.mStudent
}