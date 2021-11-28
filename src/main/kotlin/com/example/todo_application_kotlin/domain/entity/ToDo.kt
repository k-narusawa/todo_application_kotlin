package com.example.todo_application_kotlin.domain.entity

import lombok.Data
import org.springframework.data.annotation.Id
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity

@Entity
@Data
data class ToDo (
        @Id
        @Column(name = "id")
        var id: Long,
        @Column(name="name")
        var title: String,
        @Column(name="done")
        var done: Boolean? = false,
        @Column(name="limitDate")
        var limitDate: LocalDateTime
        )