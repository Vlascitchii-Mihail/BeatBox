package com.vm.timemanager.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.vm.timemanager.data.DaoTimeManager
import com.vm.timemanager.data.DatabaseTimeManager
import com.vm.timemanager.data.RepositoryTimeManager

class DaysViewModel(application: Application): AndroidViewModel(application) {

    private val repository: RepositoryTimeManager

    init {
        repository = DatabaseTimeManager.getDatabase(application)
            .getDaoTimeManager().let { dao->
                RepositoryTimeManager.getRepository(dao)
            }
    }

    fun getAllTasks(taskDay: String) = repository.getAllTasks(taskDay)

}