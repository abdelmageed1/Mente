package com.example.mente.Student.Model

import android.os.Parcelable
import com.example.mente.Models.Quiz
import kotlinx.parcelize.Parcelize

@Parcelize
class Student (
    var name :String = "",
    var age :Int = 0,
    var key  :String = "",
    var quiz : MutableList<Quiz> = mutableListOf(),


    ): Parcelable
