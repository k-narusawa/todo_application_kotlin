package com.example.todo_application_kotlin.presentation

import com.example.todo_application_kotlin.domain.form.LoginForm
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class AdminController {
    @GetMapping("/loginForm")
    fun loginForm():String{
        return "index"
    }
}