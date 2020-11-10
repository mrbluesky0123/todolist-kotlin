package me.mrbluesky.todolist.todo.service

import me.mrbluesky.todolist.todo.dao.TodoDao
import me.mrbluesky.todolist.todo.model.Todo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoService @Autowired constructor(val todoDao: TodoDao){

    fun getTodoList(status: String, partName: String, developerId: String) : List<Todo>?
            = this.todoDao.findAllByOrderById()

    fun getTodoByTodoId(todoId: Int): Todo? = this.todoDao.findById(todoId)

    fun saveTodo(todo: Todo) = this.todoDao.save(todo)

}