package me.mrbluesky.todolist.todo.dao

import me.mrbluesky.todolist.todo.model.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoDao: JpaRepository<Todo, Long> {
    fun findAllByOrderById(): List<Todo>?
    fun findById(id: Int): Todo

}