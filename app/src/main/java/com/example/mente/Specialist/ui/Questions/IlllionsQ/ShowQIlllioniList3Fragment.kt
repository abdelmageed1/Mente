package com.example.mente.Specialist.ui.Questions.IlllionsQ

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mente.R
import com.example.mente.databinding.FragmentShowQIlllioniList2Binding
import com.example.mente.databinding.FragmentShowQIlllioniList3Binding

class ShowQIlllioniList3Fragment : Fragment() {
    lateinit var binding: FragmentShowQIlllioniList3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShowQIlllioniList3Binding.inflate(inflater,container,false)
        return binding.root}




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

    }
}