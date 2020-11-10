package me.mrbluesky.todolist.todo.controller

import me.mrbluesky.todolist.todo.service.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController @Autowired constructor(val todoService: TodoService){

    @GetMapping("/todo/{id}")
    fun getSingleTodo (@PathVariable id: String) = this.todoService.getTodoByTodoId(id.toInt())

}