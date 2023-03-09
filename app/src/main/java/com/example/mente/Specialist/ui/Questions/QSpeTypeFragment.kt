package com.example.mente.Specialist.ui.Questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mente.R
import com.example.mente.Specialist.HomeSpecialistActivity
import com.example.mente.Specialist.ui.Questions.IlllionsQ.ShowQIlllioniList1Fragment
import com.example.mente.Student.View.AddStudentFragment
import com.example.mente.constant
import com.example.mente.databinding.FragmentQSpeTypeBinding


class QSpeTypeFragment : Fragment() {
    lateinit var binding: FragmentQSpeTypeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQSpeTypeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setActionBar()



        goToQNeural()
        goToQFathy()
        goToIllinois()


    }

    private fun goToQNeural() {

        binding.listQNeuralBtnGo1.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[0]
            AddStudentFragment.testName= constant.neuralCategoryList[0]
        }

        binding.listQNeuralBtnGo2.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[1]
            AddStudentFragment.testName = constant.neuralCategoryList[1]
        }

        binding.listQNeuralBtnGo3.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[2]
            AddStudentFragment.testName = constant.neuralCategoryList[2]
        }


        binding.listQNeuralBtnGo4.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[3]
            AddStudentFragment.testName = constant.neuralCategoryList[3]
        }



        binding.listQNeuralBtnGo5.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[4]
            AddStudentFragment.testName = constant.neuralCategoryList[4]
        }

        binding.listQNeuralBtnGo6.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[5]
            AddStudentFragment.testName = constant.neuralCategoryList[5]
        }
        binding.listQNeuralBtnGo7.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[6]
            AddStudentFragment.testName = constant.neuralCategoryList[6]
        }

        binding.listQNeuralBtnGo8.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[7]
            AddStudentFragment.testName = constant.neuralCategoryList[7]
        }

        binding.listQNeuralBtnGo9.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[8]
            AddStudentFragment.testName = constant.neuralCategoryList[8]
        }

        binding.listQNeuralBtnGo10.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[9]
            AddStudentFragment.testName = constant.neuralCategoryList[9]
        }

        binding.listQNeuralBtnGo11.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[10]
            AddStudentFragment.testName = constant.neuralCategoryList[10]
        }

        binding.listQNeuralBtnGo12.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[11]
            AddStudentFragment.testName = constant.neuralCategoryList[11]
        }

        binding.listQNeuralBtnGo13.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[12]
            AddStudentFragment.testName = constant.neuralCategoryList[12]
        }

        binding.listQNeuralBtnGo14.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[13]
            AddStudentFragment.testName = constant.neuralCategoryList[13]
        }

        binding.listQNeuralBtnGo15.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQSupportkFragment.categoryQuestion = constant.neuralCategoryList[14]
            AddStudentFragment.testName = constant.neuralCategoryList[14]
        }


    }

    private fun goToQFathy() {

        binding.btnListFathy1.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[0]
            AddStudentFragment.testName = constant.fathyElZayatCategoryList[0]
        }

        binding.btnListFathy2.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[1]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[1]
        }

        binding.btnListFathy3.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[2]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[2]
        }

        binding.btnListFathy4.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[3]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[3]
        }

        binding.btnListFathy5.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[4]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[4]
        }

        binding.btnListFathy6.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[5]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[5]
        }

        binding.btnListFathy7.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[6]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[6]
        }

        binding.btnListFathy8.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[7]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[7]
        }

        binding.btnListFathy9.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQFourAnsFragment.categoryQuestion = constant.fathyElZayatCategoryList[8]
            AddStudentFragment.testName  = constant.fathyElZayatCategoryList[8]
        }


    }

    private fun goToIllinois(){

        binding.listQElionoieBtnGoTo1.setOnClickListener {
            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
            ShowQIlllioniList1Fragment.categoryQuestion = constant.elIIinoiCategoryList[0]
            AddStudentFragment.testName = constant.elIIinoiCategoryList[0]

        }

        binding.listQElionoieBtnGoTo2.setOnClickListener {
//            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
//            ShowQIlllioniList1Fragment.categoryQuestion = constant.elIIinoiCategoryList[2]
//            AddStudentFragment.testName = constant.elIIinoiCategoryList[2]
        }

        binding.listQElionoieBtnGoTo3.setOnClickListener {
//            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
//            ShowQIlllioniList1Fragment.categoryQuestion = constant.elIIinoiCategoryList[2]
//            AddStudentFragment.testName = constant.elIIinoiCategoryList[2]
        }

        binding.listQElionoieBtnGoTo4.setOnClickListener {
//            findNavController().navigate(R.id.action_QSpeTypeFragment_to_addStudentFragment)
//            ShowQIlllioniList1Fragment.categoryQuestion = constant.elIIinoiCategoryList[3]
//            AddStudentFragment.testName = constant.elIIinoiCategoryList[3]
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

        binding.listQNeural.visibility = View.VISIBLE

        binding.listQElionoie.visibility = View.GONE

        binding.listQFathyElZayat.visibility = View.GONE


    }

    private fun showQElioni() {

        binding.listQNeural.visibility = View.GONE

        binding.listQElionoie.visibility = View.VISIBLE

        binding.listQFathyElZayat.visibility = View.GONE

    }

    private fun showQFathyElZayat() {

        binding.listQNeural.visibility = View.GONE

        binding.listQElionoie.visibility = View.GONE

        binding.listQFathyElZayat.visibility = View.VISIBLE

    }


    companion object {
        lateinit var typeBtnQuestions: String

    }
}