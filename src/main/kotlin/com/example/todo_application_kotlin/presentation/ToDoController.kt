package com.example.todo_application_kotlin.presentation

import com.example.todo_application_kotlin.domain.service.ToDoService
import com.example.todo_application_kotlin.domain.dto.ToDoDto
import com.example.todo_application_kotlin.domain.form.ToDoForm
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@Slf4j
@RequestMapping("/api")
class ToDoController @Autowired constructor(private val todoService: ToDoService){

    @GetMapping("/todolist")
    fun getToDoList(): List<ToDoDto> {
        return todoService.getToDoList()
    }

    @GetMapping("/todo/{id}")
    fun getToDo(@PathVariable("id") id: Long): ToDoDto {
        return todoService.getToDo(1)
    }

    @PostMapping("/todo")
    fun registerToDo(@RequestBody todoForm: ToDoForm){
        todoService.registerToDo(todoForm)
    }

    @PutMapping("/todo/{id}")
    fun editToDo(@PathVariable("id") id: Long, @RequestBody todoForm: ToDoForm){
        todoService.editToDo(id, todoForm)
    }

    @DeleteMapping("/todo/{id}")
    fun removeToDo(@PathVariable("id") id: Long){
        todoService.removeToDo(id)
    }
}