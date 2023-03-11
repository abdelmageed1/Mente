package com.example.mente.Specialist.ui.Questions.Evaluation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mente.Models.Quiz
import com.example.mente.R
import com.example.mente.Specialist.HomeSpecialistActivity
import com.example.mente.Student.Model.Student
import com.example.mente.Student.StudentViewModel.StudentViewModel
import com.example.mente.constant
import com.example.mente.databinding.FragmentEvaluationMichealBestBinding
import java.text.SimpleDateFormat
import java.util.*

class EvaluationMichealBest : Fragment() {

    lateinit var binding: FragmentEvaluationMichealBestBinding
    lateinit var studentViewModel: StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        studentViewModel = ViewModelProvider(this)[StudentViewModel::class.java]
        setActionBar()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEvaluationMichealBestBinding.inflate(inflater,container,false)

        binding.tvEvaMichTotalPoint.text = totalPoint.toString()
        binding.tvEvaMichTest1.text = "(1) الاستيعاب : $testOne"
        binding.tvEvaMichTest2.text = "(2) التناسق الحركة : $testTwo"
        binding.tvEvaMichTest3.text = "(3) المعرفة العامة  : $testThree"
        binding.tvEvaMichTest4.text ="(4) اللغة : $testFour"
        binding.tvEvaMichTest5.text = "(5) الاجتماعي والشخصي : $testFive"

        binding.tvEvaMichTotalCategory1.text = "اللفظي : $totalCategory1"
        binding.tvEvaMichTotalCategory2.text = "غير اللفظي :  $totalCategory2"


        binding.tvEvaMichTotalPoint.text = "الدرجة الكلية على الاختبار :  $totalPoint"

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnAddValueToStudent.setOnClickListener {
            addValueToStudent(constant.MichaelBestCategoryList[0] , testOne)
            addValueToStudent(constant.MichaelBestCategoryList[1] , testTwo)
            addValueToStudent(constant.MichaelBestCategoryList[2] , testThree )
            addValueToStudent(constant.MichaelBestCategoryList[3] , testFour )
            addValueToStudent(constant.MichaelBestCategoryList[4] , testFive )
        }




        binding.btnGoToHome.setOnClickListener {
            findNavController().navigate(R.id.action_evaluationMichealBest_to_homeFragment)
        }
    }











    private fun addValueToStudent( testName:String, valueOfQuiz:Int ) {

             var quiz = Quiz(testName,constant.quizTypeSpeMichaelBest,valueOfQuiz.toString(),valueOfQuiz.toString(),getCurrentDate(),getCurrentTime())
            studentViewModel.setQuizValue(quiz, currentStudent)

            studentViewModel.mSetQuizSuccess.observe(viewLifecycleOwner) {
                if (it) {

                    binding.btnAddValueToStudent.isEnabled = false
                }

            }
            studentViewModel.mSetQuizFailure.observe(viewLifecycleOwner) {
                Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
            }

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

        var totalPoint =0
        var testOne =0
       var  testTwo =0
        var testThree =0
        var testFour =0
        var testFive =0
        var totalCategory1 =0
        var totalCategory2 =0
    }

    private fun setActionBar() {
        var act = activity as HomeSpecialistActivity
        act.supportActionBar?.title = "التقييم "

    }
}