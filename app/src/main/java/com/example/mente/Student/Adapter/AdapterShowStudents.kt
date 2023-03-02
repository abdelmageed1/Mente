package com.example.mente.Student.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.mente.R
import com.example.mente.Specialist.ui.Questions.EvaluationSpeNeuralFragment
import com.example.mente.Specialist.ui.Questions.EvaluatonFathyElZayatFragment
import com.example.mente.Student.Model.Student
import com.example.mente.Student.View.AddStudentFragment
import com.example.mente.constant
import com.example.mente.databinding.RowStudentBinding

class AdapterShowStudents : RecyclerView.Adapter<AdapterShowStudents.StudentVH>() {
    lateinit var context: Context
    var listStudent: MutableList<Student> = mutableListOf()
    var quizCategory = ""


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentVH {
        context = parent.context
        return StudentVH(
            RowStudentBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: StudentVH, position: Int) {
        var current = listStudent[position]
        holder.tvStudentName.text = current.name

        holder.itemView.setOnClickListener {

            defineCategoryAndGetActionToNextPage(it, current)
//            EvaluationSpeNeuralFragment.currentStudent = current
//            it.findNavController().navigate(R.id.action_addStudentFragment_to_showQSupportkFragment)
        }

    }

    override fun getItemCount(): Int {
        return listStudent.size
    }

    fun setListOrders(list: MutableList<Student>) {
        this.listStudent = list
        notifyDataSetChanged()
    }


    class StudentVH(item: RowStudentBinding) : RecyclerView.ViewHolder(item.root) {

        var tvStudentName = item.tvRowStudentName
    }


    private fun defineCategoryAndGetActionToNextPage(fabView: View?, currentStudent: Student) {
        when (AddStudentFragment.quizCategory) {
            constant.quizTypeSpeNeural -> {
                fabView?.findNavController()
                    ?.navigate(R.id.action_addStudentFragment_to_showQSupportkFragment)

                EvaluationSpeNeuralFragment.currentStudent = currentStudent
            }
            ////////////////////////////////////
            constant.quizTypeSpeIIIIinoi -> {


            }
            constant.quizTypeSpeFathyElZayat -> {
                fabView?.findNavController()
                    ?.navigate(R.id.action_addStudentFragment_to_showQFourAnsFragment)

               EvaluatonFathyElZayatFragment.currentStudent = currentStudent
            }

        }
    }


    companion object {

        private var instance: AdapterShowStudents? = null

        fun getInstance(): AdapterShowStudents {

            if (instance == null) {
                instance = AdapterShowStudents()
            }
            return instance!!
        }


    }

}