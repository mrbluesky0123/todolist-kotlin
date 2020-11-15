package me.mrbluesky.todolist.todo.dao

import me.mrbluesky.todolist.todo.model.Todo

interface TodoDaoCustom {

    fun findByConditions(status: String, partName: String, personId: String): List<Todo>?

}