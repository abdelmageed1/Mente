package com.example.mente.Specialist.ui.Questions.IlllionsQ

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mente.Data.QuestionsSpecialist.neuralIllinois.DataNeuralIllinois
import com.example.mente.Models.Question
import com.example.mente.R
import com.example.mente.Specialist.HomeSpecialistActivity
import com.example.mente.Specialist.ui.Questions.Evaluation.EvaluationSpeNeuralFragment
import com.example.mente.Student.Model.Student
import com.example.mente.constant
import com.example.mente.databinding.FragmentShowQIlllioniIist1Binding


class ShowQIlllioniList1Fragment : Fragment() {
    private var ansSelected: String = ""
    private var loopDown: Boolean = false
    private var ans: Int = 0

    lateinit var binding: FragmentShowQIlllioniIist1Binding
    lateinit var arrQuestion: MutableList<Question>
    private var indexCurrentQuestion = 0
    private var totalPoint = 0
    private var isEndRule = false
    private var lastIndexAfterDown = 0
    private var isRoofEnd = false
    private var arrRule = mutableListOf<Boolean>()
    private var arrRoof = mutableListOf<Int>()
    var startIndexDown = 10


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setActionBar()

        when (categoryQuestion) {

            constant.elIIinoiCategoryList[0] -> {
                arrQuestion = DataNeuralIllinois.IllinoisDataList1

            }
//
//            constant.elIIinoiCategoryList[1] -> {
//               // arrQuestion = DataNeuralIllinois.IllinoisDataList2
//
//            }
//
//
//            constant.elIIinoiCategoryList[2] -> {
//                arrQuestion = DataNeuralIllinois.IllinoisDataList3
//            }
//
//            constant.elIIinoiCategoryList[3] -> {
//                arrQuestion = DataNeuralIllinois.IllinoisDataList4
//            }

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShowQIlllioniIist1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setLogicFristQ()
        setQuestionInView()
        setBtnNext()

    }

    private fun setActionBar() {
        var act = activity as HomeSpecialistActivity
        act.supportActionBar?.title = "الاختبارات "
    }

    private fun setQuestionInView() {


        if (indexCurrentQuestion < arrQuestion.size) {

            binding.tvQTitleTwoAns.text = arrQuestion[indexCurrentQuestion].strQuestion
            binding.tvQRigthTwoAns.text =
                "الاجابة الصحيحة  ${arrQuestion[indexCurrentQuestion].typicalAnswer}"


            binding.radioGroupQTwo.clearCheck()

        }
    }


    private fun setBtnNext() {

        binding.btnNext.setOnClickListener {

            var rbSelected = binding.radioGroupQTwo.checkedRadioButtonId
            ans = 0

            var isChecked = true

            when (rbSelected) {
                R.id.rbSelectNo -> {
                    ansSelected = "No"
                }
                R.id.rbSelectYes -> {
                    ansSelected = "Yes"
                }
                else -> isChecked = false
            }
            if (ansSelected == arrQuestion[indexCurrentQuestion].typicalAnswer) {
                ans = 1; totalPoint++
            } else {
                ans = 0
            }


            Log.d("abdo", "total point : $totalPoint ")

            if (isChecked) {


                if (!isEndRule) {  // هل القاعدة مش اتحققت قبل كدا
                    setLogicRuleGeneral(ans)
                    Log.d("abdo", " القاعدة لم تتحق ")

                } else {
                    indexCurrentQuestion++
                    Log.d("abdo", " القاعدة تتحقت ")
                    setLogicRoof(ans)
                }


                // هل السقف مش اتحقق
                if (indexCurrentQuestion in 0 until arrQuestion.size && !isRoofEnd) {
                    // go to next question

                    setQuestionInView()


                } else {

                    goToEvaluationPage()
                }
            } else {
                Toast.makeText(context, "اختر الاجابات", Toast.LENGTH_SHORT).show()

            }

        }
    }


    private fun goToEvaluationPage() {
        findNavController().navigate(R.id.action_showQTwoAns_to_evaluationSpeNeuralFragment)
        EvaluationSpeNeuralFragment.testName = categoryQuestion
        EvaluationSpeNeuralFragment.scoredValue = totalPoint
        EvaluationSpeNeuralFragment.numberOfQuestions = arrQuestion.size
        //EvaluationSpeNeuralFragment.numberOfQuestions = arrQuestion.size
    }

    private fun setLogicRuleGeneral(answer: Int) {

        when (categoryQuestion) {
            constant.elIIinoiCategoryList[0] -> {

                setRuleIlllioniLIst1(answer)

            }
        }
    }

    private fun setLogicRoof(answer: Int) {

        when (categoryQuestion) {
            constant.elIIinoiCategoryList[0] -> {

                setRoofIlllioniList1(answer)
            }
        }
    }


    @SuppressLint("SuspiciousIndentation")
    private fun setRuleIlllioniLIst1(answer: Int) {
        if (student.age >= 6) {

            if (answer == 1) arrRule.add(true)
            else arrRule.add(false)

            Log.d(
                "abdo", " Rule   index $indexCurrentQuestion   " +
                        "      true ${arrRule.filter { it }.size}  " +
                        "      false ${arrRule.filter { !it }.size} "
            )

            if (!arrRule.contains(false) && arrRule.size == 5)  // القاعدة تحققت ,الخمس اسئلة الاولى صحيحيين
            {
                isEndRule = true
                arrRule.clear()
                if (lastIndexAfterDown > 0) indexCurrentQuestion = lastIndexAfterDown++
                else indexCurrentQuestion++
                indexCurrentQuestion++
                return
            }



            if (arrRule.contains(false) && arrRule.size <= 5) {  // القاعدة لم تتحقق

                if (indexCurrentQuestion - 5 > 0) {                               // احتفظ ب اخر index  وصلت ليه
                    if (indexCurrentQuestion > lastIndexAfterDown) {
                        lastIndexAfterDown = indexCurrentQuestion
                    }

                    if (indexCurrentQuestion in 10..15) {
                        indexCurrentQuestion = startIndexDown
                        arrRule.clear()
                    }

                    if (indexCurrentQuestion < 10) {
                        arrRule.clear()
                    }

                    // if (indexCurrentQuestion in 5..9 ) indexCurrentQuestion = startIndexDown
                    loopDown = true

                } else {     // هذه الحالة عند عدم تحقق الشرط ابدا والخروج من القاعدة والخروج من الاسئلة
                    isEndRule = true
                    indexCurrentQuestion = 0
                    student.age = 5      // فى حالة الطلفل محققش القاعدة هيتعامل ك طفل اقل من 6 سنين
                    return
                }

            }


        }  // عمر الطالب اقبل من 6  يعنى مفيش قاعدة
        else {
            isEndRule = true; indexCurrentQuestion++; return
        }


        if (loopDown) {
            indexCurrentQuestion--
        } else
            indexCurrentQuestion++


    }


    private fun setRoofIlllioniList1(answer: Int) {

        if (answer == 0) {
            arrRoof.add(indexCurrentQuestion)
        }


        Log.d(
            "abdo", " Roof   index $indexCurrentQuestion   " +
                    "      false  ${arrRoof.toString()}  "

        )

        if (arrRoof.size >= 3) {
            Log.d("abdo", "size : ${arrRoof.size} ")
            if (arrRoof[arrRoof.size - 1] - arrRoof[arrRoof.size - 3] <= 6) {
                isRoofEnd = true
                arrRoof.clear()
                return
            }
        }


    }

    private fun setLogicFristQ() {
        when (categoryQuestion) {

            constant.elIIinoiCategoryList[0] -> {
                if (student.age < 6) {
                    indexCurrentQuestion = 0
                } else if (student.age >= 6) {
                    indexCurrentQuestion = 10
                }

            }
        }
    }

    companion object {
        lateinit var categoryQuestion: String
        lateinit var student: Student
    }


}