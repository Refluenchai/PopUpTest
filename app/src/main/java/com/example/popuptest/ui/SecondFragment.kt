package com.example.popuptest.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.popuptest.R
import com.example.popuptest.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.btnThird.setOnClickListener {
            it.findNavController()
                .navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment())
        }

        return binding.root
    }
}