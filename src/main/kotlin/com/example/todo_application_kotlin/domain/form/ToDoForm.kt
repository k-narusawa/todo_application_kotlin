package com.example.todo_application_kotlin.domain.form

import lombok.Data
import java.time.LocalDateTime

@Data
data class ToDoForm (
        var title: String,
        var done: Boolean? = false,
        var limitDate: LocalDateTime
        )