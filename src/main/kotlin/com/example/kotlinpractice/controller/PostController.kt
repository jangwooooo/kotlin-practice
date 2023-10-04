package com.example.kotlinpractice.controller

import com.example.kotlinpractice.dto.AddPostRequestDto
import com.example.kotlinpractice.dto.FindPostResponseDto
import com.example.kotlinpractice.dto.ModifyPostRequestDto
import com.example.kotlinpractice.service.CreateService
import com.example.kotlinpractice.service.FindListService
import com.example.kotlinpractice.service.ModifyService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController(
        private val createService: CreateService,
        private val modifyService: ModifyService,
        private val findListService: FindListService
) {

    @PostMapping
    fun postAdd(@RequestBody addPostRequestDto: AddPostRequestDto): ResponseEntity<Void> {
        createService.execute(addPostRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }

    @PutMapping
    fun postModify(@RequestBody modifyPostRequestDto: ModifyPostRequestDto): ResponseEntity<Void> {
        modifyService.execute(modifyPostRequestDto);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @GetMapping
    fun postListFind(): ResponseEntity<List<FindPostResponseDto>> {
        val response: List<FindPostResponseDto> = findListService.execute();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}