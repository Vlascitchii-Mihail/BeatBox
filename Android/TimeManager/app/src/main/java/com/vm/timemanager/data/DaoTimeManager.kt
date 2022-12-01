package com.vm.timemanager.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
abstract class DaoTimeManager {
    @Insert
    abstract fun addTask(task: Task)

    @Update
    abstract fun updateTask(task: Task)

    @Delete
    abstract fun deleteTask(task: Task)

    //the Room has already use background threads for returning LiveData
    @Query("SELECT * FROM tasks WHERE day = :taskDay ORDER BY id DESC")
    abstract fun getAllTasks(taskDay: String): LiveData<List<Task>>

    //the Room has already use background threads for returning LiveData
    @Query("SELECT * FROM tasks WHERE id = :taskId")
    abstract fun getTask(taskId: Int): LiveData<Task>

}