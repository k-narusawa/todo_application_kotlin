package com.example.todo_application_kotlin

import com.example.todo_application_kotlin.domain.service.MyUserDetailsService
import com.example.todo_application_kotlin.infrastructure.mapper.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.NoOpPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder


@EnableWebSecurity
class SecurityConfig @Autowired constructor(private val userMapper: UserMapper) : WebSecurityConfigurerAdapter() {

    @Bean
    fun passwordEncoder(): PasswordEncoder? {
        return NoOpPasswordEncoder.getInstance();
    }

    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
                .mvcMatchers("/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService(MyUserDetailsService(userMapper)).passwordEncoder(passwordEncoder())// ④
    }
}