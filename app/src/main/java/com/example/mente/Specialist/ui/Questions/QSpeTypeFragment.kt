package com.example.mente.Specialist.ui.Questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mente.R
import com.example.mente.Specialist.HomeSpecialistActivity
import com.example.mente.Student.View.AddStudentFragment
import com.example.mente.constant
import com.example.mente.databinding.FragmentQSpeTypeBinding


class QSpeTypeFragment : Fragment() {
    lateinit var bindibg: FragmentQSpeTypeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindibg = FragmentQSpeTypeBinding.inflate(inflater, container, false)
        return bindibg.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setActionBar()



        goToQNeural()
        goToQFathy()


    }

    private fun goToQNeural() {

        bindibg.listQNeuralBtnGo1.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[0]
            AddStudentFragment.testName= constant.neuralCategoryList[0]
        }

        bindibg.listQNeuralBtnGo2.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[1]
            AddStudentFragment.testName = constant.neuralCategoryList[1]
        }

        bindibg.listQNeuralBtnGo3.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[2]
            AddStudentFragment.testName = constant.neuralCategoryList[2]
        }


        bindibg.listQNeuralBtnGo4.setOnClickListener {
            //  findNavController().navigate(R.id.action_QSpeTypeFragment_to_showQSupportkFragment)
              // ShowQSupportkFragment.categoryQuestion = constant.neuralCategory4
           // AddStudentFragment.testName = constant.neuralCategory4
        }



        bindibg.listQNeuralBtnGo5.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[4]
            AddStudentFragment.testName = constant.neuralCategoryList[4]
        }

        bindibg.listQNeuralBtnGo6.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[5]
            AddStudentFragment.testName = constant.neuralCategoryList[5]
        }
        bindibg.listQNeuralBtnGo7.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[6]
            AddStudentFragment.testName = constant.neuralCategoryList[6]
        }

        bindibg.listQNeuralBtnGo8.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[7]
            AddStudentFragment.testName = constant.neuralCategoryList[7]
        }

        bindibg.listQNeuralBtnGo9.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[8]
            AddStudentFragment.testName = constant.neuralCategoryList[8]
        }

        bindibg.listQNeuralBtnGo10.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[9]
            AddStudentFragment.testName = constant.neuralCategoryList[9]
        }

        bindibg.listQNeuralBtnGo11.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[10]
            AddStudentFragment.testName = constant.neuralCategoryList[10]
        }

        bindibg.listQNeuralBtnGo12.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[11]
            AddStudentFragment.testName = constant.neuralCategoryList[11]
        }

        bindibg.listQNeuralBtnGo13.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[12]
            AddStudentFragment.testName = constant.neuralCategoryList[12]
        }

        bindibg.listQNeuralBtnGo14.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[13]
            AddStudentFragment.testName = constant.neuralCategoryList[13]
        }

        bindibg.listQNeuralBtnGo15.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[14]
            AddStudentFragment.testName = constant.neuralCategoryList[14]
        }


    }

    private fun goToQFathy() {

        bindibg.btnListFathy1.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[0]
            AddStudentFragment.testName = constant.fathyElZayatCategoryList[0]
        }

        bindibg.btnListFathy2.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[1]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[1]
        }

        bindibg.btnListFathy3.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[2]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[2]
        }

        bindibg.btnListFathy4.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)

            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[3]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[3]
        }

        bindibg.btnListFathy5.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[4]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[4]
        }


    }

    private fun setActionBar() {
        var act = activity as HomeSpecialistActivity
        when (typeBtnQuestions) {
            constant.btnGoToNeuralQuestions -> {
                act.supportActionBar?.title = "اختبارات الفرز العصبى "
                showQNeural()
            }
            constant.btnGoToElioniQuestions -> {
                act.supportActionBar?.title = "اختبارات الينوي"
                showQElioni()
            }
            constant.btnGoToFathyElZayatQuestions -> {
                act.supportActionBar?.title = "اختبارات فتحى الزيات"
                showQFathyElZayat()

            }
        }

    }


    private fun showQNeural() {

        bindibg.listQNeural.visibility = View.VISIBLE

        bindibg.listQElionoie.visibility = View.GONE

        bindibg.listQFathyElZayat.visibility = View.GONE


    }

    private fun showQElioni() {

        bindibg.listQNeural.visibility = View.GONE

        bindibg.listQElionoie.visibility = View.VISIBLE

        bindibg.listQFathyElZayat.visibility = View.GONE

    }

    private fun showQFathyElZayat() {

        bindibg.listQNeural.visibility = View.GONE

        bindibg.listQElionoie.visibility = View.GONE

        bindibg.listQFathyElZayat.visibility = View.VISIBLE

    }


    companion object {
        lateinit var typeBtnQuestions: String

    }
}