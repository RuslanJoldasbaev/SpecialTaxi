package com.example.specialtaxi.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.specialtaxi.R
import com.example.specialtaxi.databinding.FragmentRaz1Binding
import com.example.specialtaxi.databinding.FragmentRaz2Binding

class Raz2Fragment : Fragment(R.layout.fragment_raz_2) {
    private lateinit var binding: FragmentRaz2Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRaz2Binding.bind(view)

        binding.raz2Button.setOnClickListener {
            findNavController().navigate(
                Raz1FragmentDirections.actionRaz1FragmentToRaz2Fragment()
            )
        }
    }
}