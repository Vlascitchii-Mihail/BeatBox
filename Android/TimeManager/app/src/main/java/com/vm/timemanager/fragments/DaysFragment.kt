package com.vm.timemanager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.vm.timemanager.adapter.AdapterDays
import com.vm.timemanager.data.Task
import com.vm.timemanager.databinding.FragmentDaysBinding
import com.vm.timemanager.viewModel.DaysViewModel

/**
 * A simple [Fragment] subclass.
 */
class DaysFragment : Fragment() {

    private var _binding: FragmentDaysBinding? = null
    private val binding get() = _binding!!

    //private val dayName: String = "Monday"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //val view =  inflater.inflate(R.layout.fragment_day, container, false)
        _binding = FragmentDaysBinding.inflate(inflater, container, false)
        val viewModel = ViewModelProvider(this)[DaysViewModel::class.java]

        val adapter = AdapterDays()

        binding.taskList.adapter = adapter

        val dayName = DaysFragmentArgs.fromBundle(requireArguments()).dayName

        viewModel.getAllTasks(dayName).observe(viewLifecycleOwner, Observer { taskList ->
            adapter.submitList(taskList)
        })


        binding.newTaskFab.setOnClickListener {
            val action = DaysFragmentDirections.actionDayFragmentToNewTaskAddingFragment(viewModel.task)
            DaysFragment().findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}