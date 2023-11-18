package com.example.specialtaxi.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.specialtaxi.R
import com.example.specialtaxi.databinding.FragmentLoginCodeBinding
import com.example.specialtaxi.databinding.FragmentRaz1Binding

class LoginCodeFragment : Fragment(R.layout.fragment_login_code) {
    private lateinit var binding: FragmentLoginCodeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLoginCodeBinding.bind(view)

        binding.locationButtonCode.setOnClickListener {
            findNavController().navigate(
                LoginCodeFragmentDirections.actionLoginCodeFragmentToLocationFragment()
            )
        }
    }
}