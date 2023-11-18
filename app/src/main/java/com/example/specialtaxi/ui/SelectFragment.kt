package com.example.specialtaxi.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.specialtaxi.R
import com.example.specialtaxi.databinding.FragmentSelectBinding

class SelectFragment : Fragment(R.layout.fragment_select) {
    private lateinit var binding : FragmentSelectBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSelectBinding.bind(view)



    }
}