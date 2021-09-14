package com.example.popuptest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.popuptest.databinding.FragmentFirstBinding
import com.example.popuptest.R

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.btnSecond.setOnClickListener {
            it.findNavController()
                .navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment())
        }

        return binding.root
    }
}