package com.example.todo_application_kotlin.domain.form

import lombok.Data
import org.jetbrains.annotations.NotNull
import java.time.LocalDateTime

@Data
data class LoginForm (
        var email: String?,

        var password: String?,

        var rememberMe: Boolean? = false
)