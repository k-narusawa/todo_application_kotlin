package com.example.todo_application_kotlin.infrastructure.mapper

import com.example.todo_application_kotlin.domain.entity.ToDo
import com.example.todo_application_kotlin.domain.form.ToDoForm
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.session.RowBounds
import org.springframework.stereotype.Repository

@Repository
@Mapper
interface ToDoMapper {
    fun findById(Id: Long): ToDo
    fun findAll(): List<ToDo>
    fun register(todoForm: ToDoForm): Long
    fun edit(todo: ToDo):Long
    fun remove(id: Long):Long
}