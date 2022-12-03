package com.vm.timemanager.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vm.timemanager.data.DaoTimeManager
import com.vm.timemanager.data.DatabaseTimeManager
import com.vm.timemanager.data.RepositoryTimeManager
import com.vm.timemanager.data.Task
import kotlinx.coroutines.launch

class DaysViewModel(application: Application): AndroidViewModel(application) {

    private val repository: RepositoryTimeManager

    val task = Task()

    init {
        repository = DatabaseTimeManager.getDatabase(application)
            .getDaoTimeManager().let { dao->
                RepositoryTimeManager.getRepository(dao)
            }
    }

    fun getAllTasks(taskDay: String) = repository.getAllTasks(taskDay)

    fun addTask(task: Task) {
        viewModelScope.launch {
            repository.addTask(task)
        }
    }

}