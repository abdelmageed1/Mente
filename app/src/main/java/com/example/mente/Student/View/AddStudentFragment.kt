package com.example.mente.Student.View

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mente.R
import com.example.mente.Specialist.HomeSpecialistActivity
import com.example.mente.Specialist.ui.Questions.Evaluation.EvaluationMichealBest
import com.example.mente.Specialist.ui.Questions.Evaluation.EvaluationSpeNeuralFragment
import com.example.mente.Specialist.ui.Questions.Evaluation.EvaluatonFathyElZayatFragment
import com.example.mente.Specialist.ui.Questions.IlllionsQ.ShowQIlllioniList1Fragment
import com.example.mente.Student.Adapter.AdapterShowStudents
import com.example.mente.Student.Model.Student
import com.example.mente.Student.Repo.RepoStudent
import com.example.mente.Student.StudentViewModel.StudentViewModel
import com.example.mente.constant
import com.example.mente.databinding.FragmentAddStudentBinding

class AddStudentFragment : Fragment() {
    lateinit var binding: FragmentAddStudentBinding
    lateinit var studentViewModel: StudentViewModel
    lateinit var currentStudent: Student
    var arrStudent = mutableListOf<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        studentViewModel = ViewModelProvider(this)[StudentViewModel::class.java]
        studentViewModel.getStudent()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddStudentBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setActionBar()
        setQuizType()
        addStudent()

        setStudentFromDBToRecycle()

        setSearchView()
    }

    private fun setSearchView() {
        binding.searchViewStudent.addTextChangedListener {text->
            //   if(text!!.isNotEmpty())
            setRecycle(arrStudent.filter{it.name.contains(text.toString())} as MutableList<Student>)

        }
    }


    private fun setQuizType() {
        when (testName) {
            in constant.neuralCategoryList -> {
                quizCategory = constant.quizTypeSpeNeural
            }
            in constant.elIIinoiCategoryList -> {
                quizCategory = constant.quizTypeSpeIIIIinoi
            }
            in constant.fathyElZayatCategoryList -> {
                quizCategory = constant.quizTypeSpeFathyElZayat
            }
            in constant.MichaelBestCategoryList -> {
                quizCategory = constant.quizTypeSpeMichaelBest
            }
        }
    }


    private fun setStudentFromDBToRecycle() {
        studentViewModel.getMutableStudents().observe(viewLifecycleOwner) {
            if (it != null) {
                arrStudent = it
                setRecycle(it)


                if (it.size == 0) {
                    binding.tvStudentIsEmpty.visibility = View.VISIBLE

                }
            }
        }
    }

    private fun setRecycle(it: MutableList<Student>) {
        var adapterStudent = AdapterShowStudents.getInstance()
        adapterStudent.quizCategory = quizCategory
        binding.recycleViewStudent.layoutManager = LinearLayoutManager(context)
        binding.recycleViewStudent.adapter = adapterStudent
        adapterStudent.setListOrders(it)

    }

    private fun addStudent() {
        binding.fabAddStudent.setOnClickListener { fabView ->

            var builder = AlertDialog.Builder(context)
            builder.apply {

                setView(R.layout.layout_add_student)
                var alter = builder.show()

                var btnSaveData = alter.findViewById<Button>(R.id.btnAddNewUser)
                btnSaveData.setOnClickListener {
                    var name = alter.findViewById<EditText>(R.id.et_nameOfStudent).text.toString()
                    var age = alter.findViewById<EditText>(R.id.et_ageOfStudent).text.toString()


                    if (name.isNotEmpty() && age.isNotEmpty()) {
                        if (age.toInt() in 3..18) {
                            var student = Student(name, age.toInt())
                            setStudentInfoToDB(student)

                            studentViewModel.mAddStudentFailure.observe(viewLifecycleOwner) { message ->
                                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                            }
                            studentViewModel.mAddStudentSuccess.observe(viewLifecycleOwner) {
                                if (it) {
                                    Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show()
                                    alter.dismiss()

                                    defineCategoryAndGetActionToNextPage(fabView)

                                }
                            }


                        } else {
                            Toast.makeText(
                                context,
                                "عمر الطالب غير مناسب ",
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                    } else {
                        Toast.makeText(
                            context,
                            "اكتب الاسم والعمر للطالب",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }

        }
    }



    private fun setStudentInfoToDB(student: Student) {
        studentViewModel.addNewStudent(student)
    }

    private fun defineCategoryAndGetActionToNextPage(fabView: View?)
    {
        when (quizCategory) {
            constant.quizTypeSpeNeural -> {
                fabView?.findNavController()
                    ?.navigate(R.id.action_addStudentFragment_to_showQSupportkFragment)
                getStudentHasAddedNow()
                EvaluationSpeNeuralFragment.currentStudent =
                    currentStudent
            }
            ////////////////////////////////////
            constant.quizTypeSpeIIIIinoi -> {
                fabView?.findNavController()
                    ?.navigate(R.id.action_addStudentFragment_to_showQTwoAns)
                getStudentHasAddedNow()
                EvaluationSpeNeuralFragment.currentStudent =
                    currentStudent
                ShowQIlllioniList1Fragment.student = currentStudent

            }
            constant.quizTypeSpeFathyElZayat -> {
                fabView?.findNavController()
                    ?.navigate(R.id.action_addStudentFragment_to_showQFourAnsFragment)
                getStudentHasAddedNow()
                EvaluatonFathyElZayatFragment.currentStudent =
                    currentStudent
            }

            constant.quizTypeSpeMichaelBest ->{
                fabView?.findNavController()?.navigate(R.id.action_addStudentFragment_to_QSpeMichaelType)
                EvaluationMichealBest.currentStudent = currentStudent
            }

        }
    }


    private fun setActionBar() {
        var act = activity as HomeSpecialistActivity
        act.supportActionBar?.title = " اختر الطالب  "
    }

    fun getStudentHasAddedNow() {
        currentStudent = RepoStudent.getInstance().studentAddedNow
    }


    companion object {
        lateinit var testName: String
        lateinit var quizCategory: String
    }
}