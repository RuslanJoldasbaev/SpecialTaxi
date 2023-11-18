package com.example.specialtaxi.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.specialtaxi.R
import com.example.specialtaxi.databinding.FragmentLocationBinding

class LocationFragment : Fragment(R.layout.fragment_location) {
    private lateinit var binding: FragmentLocationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLocationBinding.bind(view)

        binding.locationButton.setOnClickListener {
            findNavController().navigate(
                LocationFragmentDirections.actionLocationFragmentToRaz1Fragment()
            )
        }
    }
}