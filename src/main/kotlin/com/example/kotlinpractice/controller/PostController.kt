package com.example.kotlinpractice.controller

import com.example.kotlinpractice.dto.AddPostRequestDto
import com.example.kotlinpractice.service.CreateService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController(
        private val createService: CreateService
) {

    @PostMapping
    fun postAdd(@RequestBody addPostRequestDto: AddPostRequestDto): ResponseEntity<Void> {
        createService.execute(addPostRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }
}