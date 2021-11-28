package com.example.todo_application_kotlin.domain.dto

import lombok.Data
import org.springframework.data.annotation.Id
import java.time.LocalDateTime
import javax.persistence.Column

@Data
class ToDoDto (
        var id: Long,
        var title: String,
        var done: Boolean? = false,
        var limitDate: LocalDateTime
)