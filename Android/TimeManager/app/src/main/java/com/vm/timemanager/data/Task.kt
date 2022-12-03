package com.vm.timemanager.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.time.OffsetDateTime

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey (autoGenerate = true) var id: Int = 0,
    val day: String? = null,
    var taskName: String = "",
    val startTime: OffsetDateTime? = null,
    val endTime: OffsetDateTime? = null,
    var taskDescription: String = ""
)
