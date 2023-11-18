package com.example.specialtaxi.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.specialtaxi.R
import com.example.specialtaxi.databinding.FragmentRaz1Binding

class Raz1Fragment : Fragment(R.layout.fragment_raz_1) {
    private lateinit var binding: FragmentRaz1Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRaz1Binding.bind(view)

        binding.raz1Button.setOnClickListener {
            findNavController().navigate(
                Raz1FragmentDirections.actionRaz1FragmentToRaz2Fragment()
           )
        }
    }
}