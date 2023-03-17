package com.example.homework_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_8.databinding.Fragment1Binding
import com.example.homework_8.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    lateinit var binding: Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = Fragment2Binding.inflate(inflater)
        return binding.root
    }

    companion object {

        fun newInstance() = Fragment2()

    }
}