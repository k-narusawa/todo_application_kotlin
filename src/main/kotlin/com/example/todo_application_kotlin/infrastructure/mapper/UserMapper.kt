package com.example.todo_application_kotlin.infrastructure.mapper

import com.example.todo_application_kotlin.domain.entity.IUser
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Repository
@Mapper
interface UserMapper {
    fun findByEmail(email: String):IUser?
}