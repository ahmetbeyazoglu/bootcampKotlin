package com.herpestes.userapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.herpestes.userapp.R
import com.herpestes.userapp.databinding.FragmentKisiDetayBinding


class KisiDetayFragment : Fragment() {
    private lateinit var binding : FragmentKisiDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentKisiDetayBinding.inflate(inflater, container, false)
        return binding.root
    }
}