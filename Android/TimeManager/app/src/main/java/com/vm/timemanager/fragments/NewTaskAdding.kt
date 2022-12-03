package com.vm.timemanager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.vm.timemanager.data.Task
import com.vm.timemanager.databinding.FragmentNewTaskAddingBinding
import com.vm.timemanager.viewModel.DaysViewModel

/**
 * Adding a new Task
 */
class NewTaskAdding : Fragment() {

    private var _binding: FragmentNewTaskAddingBinding? = null
    private val binding get() = _binding!!
    private val viewModel by activityViewModels<DaysViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_new_task_adding, container, false)
        _binding = FragmentNewTaskAddingBinding.inflate(inflater, container, false)
        val view = binding.root

        //val viewModel = ViewModelProvider(this)[DaysViewModel::class.java]

        val taskFromDaysFragment: Task = NewTaskAddingArgs.fromBundle(requireArguments()).task

        binding.apply {
            task = taskFromDaysFragment

            saveButton.setOnClickListener {
                viewModel.addTask(task)
            }
        }


        return view
    }
}