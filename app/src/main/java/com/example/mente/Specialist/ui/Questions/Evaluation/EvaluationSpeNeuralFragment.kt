package com.example.mente.Specialist.ui.Questions.Evaluation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mente.Models.Quiz
import com.example.mente.R
import com.example.mente.Specialist.HomeSpecialistActivity
import com.example.mente.Student.Model.Student
import com.example.mente.Student.StudentViewModel.StudentViewModel
import com.example.mente.constant
import com.example.mente.databinding.FragmentEvaluationSpeNeuralBinding
import java.text.SimpleDateFormat
import java.util.*


class EvaluationSpeNeuralFragment : Fragment() {

    lateinit var binding: FragmentEvaluationSpeNeuralBinding
    var quizCategory = ""
    lateinit var studentViewModel: StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        studentViewModel = ViewModelProvider(this)[StudentViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEvaluationSpeNeuralBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setActionBar()


        setViews()
        setQuizType()
        addValueToStudent()
        gotoHome()

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
        }


    }

    @SuppressLint("StringFormatInvalid")
    private fun setViews() {
      //  binding.tvEvaluationTotalPoint.text = totalValue.toString()
        binding.tvEvaluationScoredPoint.text = "  الدرجة  : $scoredValue "
        binding.testNameEvaluation.text = "  اختبار  $testName "
     //   binding.tvNumberOfTotalQuestions.text = "  عدد الاسئلة الكلى  : $numberOfQuestions "
    //    binding.tvNumberOfRightQuestions.text = "   عدد الاجابات الصحيحة : $numberOfRightAns "
        binding.tvEvaluationStudentName.text = "  الطالب : ${currentStudent.name} "


    }

    private fun gotoHome() {
        binding.btnGoToHome.setOnClickListener {
            findNavController().navigate(R.id.action_evaluationSpeNeuralFragment_to_homeFragment)
        }


    }

    private fun addValueToStudent() {
        binding.btnAddValueToStudent.setOnClickListener {
            var quiz = Quiz(
                testName,
                quizCategory,
                scoredValue.toString(),
                scoredValue.toString(),
                getCurrentDate(),
                getCurrentTime()
            )
            studentViewModel.setQuizValue(quiz, currentStudent)

            studentViewModel.mSetQuizSuccess.observe(viewLifecycleOwner) {
                if (it) {

                    binding.btnAddValueToStudent.text = "تم اضافة نتيجة الاختبار"
                    binding.btnAddValueToStudent.isEnabled = false
                }

            }
            studentViewModel.mSetQuizFailure.observe(viewLifecycleOwner) {
                Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
            }

        }
    }


    private fun setActionBar() {
        var act = activity as HomeSpecialistActivity
        act.supportActionBar?.title = "    نتيجة الاختبار    "

    }

    private fun getCurrentDate(): String {
        val calendar = Calendar.getInstance()
        val simpleDateFormat =
            SimpleDateFormat("MMM dd, yyyy")
        return simpleDateFormat.format(calendar.time)
    }

    private fun getCurrentTime(): String {
        val calendar = Calendar.getInstance()
        val simpleDateFormat = SimpleDateFormat("HH:mm:ss ")
        return simpleDateFormat.format(calendar.time)
    }


    companion object {
        lateinit var currentStudent: Student
        var totalValue = 0
        var numberOfQuestions = 0
        var numberOfRightAns = 0
        var scoredValue = 0
        var testName = ""


    }
}