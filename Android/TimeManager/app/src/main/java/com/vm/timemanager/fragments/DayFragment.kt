package com.vm.timemanager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.vm.timemanager.R
import com.vm.timemanager.adapter.AdapterDays
import com.vm.timemanager.databinding.FragmentDayBinding
import com.vm.timemanager.databinding.FragmentSevenDaysBinding
import com.vm.timemanager.viewModel.DaysViewModel

/**
 * A simple [Fragment] subclass.
 */
class DayFragment : Fragment() {

    private var _binding: FragmentDayBinding? = null
    private val binding get() = _binding!!

    //private val dayName: String = "Monday"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //val view =  inflater.inflate(R.layout.fragment_day, container, false)
        _binding = FragmentDayBinding.inflate(inflater, container, false)
        val viewModel = ViewModelProvider(this)[DaysViewModel::class.java]

        val adapter = AdapterDays()

        binding.taskList.adapter = adapter

        val dayName = DayFragmentArgs.fromBundle(requireArguments()).dayName

        viewModel.getAllTasks(dayName).observe(viewLifecycleOwner, Observer { taskList ->
            adapter.submitList(taskList)
        })

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}