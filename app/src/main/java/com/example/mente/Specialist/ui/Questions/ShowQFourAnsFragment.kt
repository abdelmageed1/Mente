package com.example.mente.Specialist.ui.Questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mente.Data.QuestionsSpecialist.FathyElZayat.DataFathyElZayat
import com.example.mente.Models.Question
import com.example.mente.R
import com.example.mente.Specialist.HomeSpecialistActivity
import com.example.mente.constant
import com.example.mente.databinding.FragmentShowQFourAnsBinding


class ShowQFourAnsFragment : Fragment() {
    lateinit var binding: FragmentShowQFourAnsBinding
    lateinit var arrQuestion: MutableList<Question>
    private var indexCurrentQuestion = 0
    private var totalPoint = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setActionBar()

        when (categoryQuestion) {
            constant.fathyElZayatCategoryList[0] -> {
                arrQuestion = DataFathyElZayat.fathyElZayatDataList1
            }

            constant.fathyElZayatCategoryList[1] -> {
                arrQuestion = DataFathyElZayat.fathyElZayatDataList2
            }

            constant.fathyElZayatCategoryList[2] -> {
                arrQuestion = DataFathyElZayat.fathyElZayatDataList3
            }


            constant.fathyElZayatCategoryList[3] -> {
                arrQuestion = DataFathyElZayat.fathyElZayatDataList4
            }


            constant.fathyElZayatCategoryList[4] -> {
                arrQuestion = DataFathyElZayat.fathyElZayatDataList5
            }


        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShowQFourAnsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       // GetArrQuestions()
        setQuestionInView()

        setBtnNext()


    }

    private fun setBtnNext() {

        binding.btnNext.setOnClickListener {

            var rbSelected = binding.radioGroupQFour.checkedRadioButtonId
            var ans = 0
            var isChecked = true

            when (rbSelected) {
                R.id.rbSelect1 -> ans = 0
                R.id.rbSelect2 -> ans = 1
                R.id.rbSelect3 -> ans = 2
                R.id.rbSelect4 -> ans = 3
                R.id.rbSelect5 -> ans = 4
                else -> isChecked = false
            }

            if (isChecked) {
                    totalPoint += ans
                     indexCurrentQuestion++
                    if (indexCurrentQuestion < arrQuestion.size) {
                        // go to next question
                        setQuestionInView()


                    }
                    else
                    {
                        findNavController().navigate(R.id.action_showQFourAnsFragment_to_evaluatonFathyElZayatFragment3)
                        EvaluatonFathyElZayatFragment.testName = categoryQuestion
                        EvaluatonFathyElZayatFragment.scoredValue = totalPoint
                    }
            }


            else {
                Toast.makeText(context, "اختر الاجابات", Toast.LENGTH_SHORT).show()

               }

        }
    }

    private fun setQuestionInView() {

        if (indexCurrentQuestion < arrQuestion.size)
        {
            binding.tvQTitleFourAns.text = arrQuestion[indexCurrentQuestion].strQuestion

            binding.radioGroupQFour.clearCheck()

        }




    }

   fun setRbFalse() {
       binding.rbSelect1.isChecked = false
       binding.rbSelect2.isChecked = false
       binding.rbSelect3.isChecked = false
       binding.rbSelect4.isChecked = false
       binding.rbSelect5.isChecked = false
   }

    private fun setActionBar() {
        var act = activity as HomeSpecialistActivity
        act.supportActionBar?.title = "الاختبارات "
    }



    companion object {

        lateinit var categoryQuestion: String
    }
}