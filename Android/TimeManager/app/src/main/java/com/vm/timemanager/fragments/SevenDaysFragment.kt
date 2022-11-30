package com.vm.timemanager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.vm.timemanager.R
import com.vm.timemanager.databinding.FragmentSevenDaysBinding
import com.vm.timemanager.viewModel.DaysViewModel

/**
 * Handles the view of the Seven Days.
 */
class SevenDaysFragment : Fragment() {

    private var _binding: FragmentSevenDaysBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_seven_days, container, false)
        val _binding = FragmentSevenDaysBinding.inflate(inflater, container, false)

        val viewModel = ViewModelProvider(this)[DaysViewModel::class.java]
        binding.daysViewModel = viewModel



        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}