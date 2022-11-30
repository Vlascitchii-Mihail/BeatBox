package com.vm.timemanager.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter

@Database(entities = [Task::class], version = 1, exportSchema = false)

@TypeConverter(Converters::class)
abstract class DatabaseTimeManager : RoomDatabase() {

    abstract fun getDaoTimeManager() : DaoTimeManager

    companion object {

    }

}