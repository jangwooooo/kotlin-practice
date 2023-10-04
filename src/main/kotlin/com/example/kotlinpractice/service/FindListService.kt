package com.example.kotlinpractice.service

import com.example.kotlinpractice.dto.FindPostResponseDto
import com.example.kotlinpractice.repository.PostRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class FindListService(
        private val postRepository: PostRepository
) {

    @Transactional
    fun execute(): List<FindPostResponseDto> = postRepository.findAll().map {
            FindPostResponseDto(
                    it.title,
                    it.category
            )
    }
}