package com.example.mente.Specialist.ui.history.ViewModel

import androidx.lifecycle.ViewModel
import com.example.mente.Specialist.ui.history.repo.RepoResultOfQuiz

class QuizResultVM  : ViewModel() {


     var repoQuiz = RepoResultOfQuiz.getInstance()

    var  mGetQuiz = repoQuiz.mQuiz

    fun getResultQuiz(studentId :String , categoryQuiz : String){
        repoQuiz.getQuizResult(studentId , categoryQuiz)
    }



}