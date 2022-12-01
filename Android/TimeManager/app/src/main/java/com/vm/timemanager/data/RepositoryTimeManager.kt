package com.vm.timemanager.data

class RepositoryTimeManager(private val daoTimeManager: DaoTimeManager) {

    suspend fun addTask(task: Task) = daoTimeManager.addTask(task)

    suspend fun updateTask(task: Task) = daoTimeManager.updateTask(task)

    suspend fun deleteTask(task: Task) = daoTimeManager.deleteTask(task)

    fun getAllTasks(taskDay: String) = daoTimeManager.getAllTasks(taskDay)

    fun getTask(taskId: Int) = daoTimeManager.getTask(taskId)

    companion object {

        //Помечает вспомогательное поле JVM аннотированного свойства как изменчивое,
        // что означает, что записи в это поле немедленно становятся видимыми для других потоков.
        @Volatile
        private var instance: RepositoryTimeManager? = null

        /**
         * crete a new Repository's object
         */
        fun getRepository(dao: DaoTimeManager) =
            this.instance ?: synchronized(this) {
                instance ?: RepositoryTimeManager(dao).also {
                    instance = it
                }
            }
    }
}