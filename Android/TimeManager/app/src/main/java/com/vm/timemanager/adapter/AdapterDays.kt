package com.vm.timemanager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.vm.timemanager.data.Task
import com.vm.timemanager.databinding.FragmentDayBinding
import com.vm.timemanager.databinding.FragmentSevenDaysBinding
import com.vm.timemanager.databinding.HolderTaskBinding
import kotlinx.coroutines.NonDisposableHandle
import kotlinx.coroutines.NonDisposableHandle.parent

class AdapterDays: ListAdapter<Task, AdapterDays.TaskItemViewHolder>(TaskDiffItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskItemViewHolder =
        TaskItemViewHolder.inflateFrom(parent)
    override fun onBindViewHolder(holder: TaskItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }


    class TaskItemViewHolder(val binding: HolderTaskBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item : Task) {
            binding.task = item
        }

        companion object {
            fun inflateFrom(parent: ViewGroup): TaskItemViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = HolderTaskBinding.inflate(layoutInflater, parent, false)
                return TaskItemViewHolder(binding)
            }

        }
    }
}