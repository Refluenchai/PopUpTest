package com.example.popuptest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.popuptest.databinding.FragmentThirdBinding
import com.example.popuptest.R

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentThirdBinding.inflate(inflater, container, false)

        binding.btnFourth.setOnClickListener {
            it.findNavController()
                .navigate(ThirdFragmentDirections.actionThirdFragmentToFourthFragment())
        }

        return binding.root
    }
}