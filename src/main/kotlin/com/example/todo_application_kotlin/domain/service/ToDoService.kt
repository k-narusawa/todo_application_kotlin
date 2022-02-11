package com.example.todo_application_kotlin.domain.service

import com.example.todo_application_kotlin.domain.dto.ToDoDto
import com.example.todo_application_kotlin.domain.entity.ToDo
import com.example.todo_application_kotlin.domain.form.ToDoForm
import com.example.todo_application_kotlin.infrastructure.mapper.ToDoMapper
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ToDoService @Autowired constructor(private val todoMapper: ToDoMapper){
    val logger: org.slf4j.Logger = LoggerFactory.getLogger(ToDoService::class.java)

    fun getToDoList(): List<ToDoDto> {
        val list = todoMapper.findAll()
        val todoDtoList = mutableListOf<ToDoDto>()
        list.forEach{
            value -> todoDtoList.add(convertToToDo(value))
        }
        return todoDtoList
    }

    fun getToDo(id: Long): ToDoDto {
        val todo = todoMapper.findById(id)
        return convertToToDo(todo)
    }

    fun registerToDo(todoForm: ToDoForm){
        val rows = todoMapper.register(todoForm)
        logger.info("affected {} rows", rows)
    }

    fun editToDo(id: Long, todoForm: ToDoForm){
        val rows = todoMapper.edit(ToDo(id, todoForm.title, todoForm.done, todoForm.limitDate))
        logger.info("affected {} rows", rows)
    }

    fun removeToDo(id: Long){
        val rows = todoMapper.remove(id)
        logger.info("affected {} rows", rows)
    }

    private fun convertToToDo(todo: ToDo): ToDoDto {
        return ToDoDto(todo.todo_id, todo.title, todo.done, todo.limitDate)
    }
}