package com.example.kotlinpractice.service

import com.example.kotlinpractice.dto.FindPostResponseDto
import com.example.kotlinpractice.entity.Post
import com.example.kotlinpractice.repository.PostRepository
import jakarta.transaction.Transactional
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class FindService(
        private val postRepository: PostRepository
){

    @Transactional
    fun execute(id: Long): FindPostResponseDto {
        val post: Post = postRepository.findByIdOrNull(id)?: throw RuntimeException();
        return FindPostResponseDto(
                post.title,
                post.category
        )
    }
}