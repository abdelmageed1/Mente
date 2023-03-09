package com.example.mente.Specialist.ui.Questions.IlllionsQ

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mente.R
import com.example.mente.databinding.FragmentShowQIlllioniIist1Binding
import com.example.mente.databinding.FragmentShowQIlllioniList2Binding

class ShowQIlllioniList2Fragment : Fragment() {
    lateinit var binding: FragmentShowQIlllioniList2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding = FragmentShowQIlllioniList2Binding.inflate(inflater,container,false)
  return binding.root

     }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

    }
}