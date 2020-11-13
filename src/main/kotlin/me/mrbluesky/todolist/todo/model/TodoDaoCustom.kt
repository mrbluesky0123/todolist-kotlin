package me.mrbluesky.todolist.todo.model

interface TodoDaoCustom {

    fun findByConditions(status: String, partName: String, personId: String): List<Todo>

}