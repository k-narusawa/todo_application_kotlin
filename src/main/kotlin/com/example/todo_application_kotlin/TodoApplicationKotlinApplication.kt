package com.example.todo_application_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoApplicationKotlinApplication

fun main(args: Array<String>) {
	runApplication<TodoApplicationKotlinApplication>(*args)
}
