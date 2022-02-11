package com.example.todo_application_kotlin.domain.service

import com.example.todo_application_kotlin.infrastructure.mapper.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException

open class MyUserDetailsService @Autowired constructor(private val userMapper: UserMapper) : UserDetailsService {

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(username: String): UserDetails? {
        println(userMapper.findByEmail(username))
        return userMapper.findByEmail(username)
    }

}
