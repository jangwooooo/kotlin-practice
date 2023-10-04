package com.example.kotlinpractice.service

import com.example.kotlinpractice.dto.ModifyPostRequestDto
import com.example.kotlinpractice.repository.PostRepository
import jakarta.transaction.Transactional
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ModifyService(
        private val postRepository: PostRepository
) {

    @Transactional
    fun execute(modifyPostRequestDto: ModifyPostRequestDto) {
        val post = postRepository.findByIdOrNull(modifyPostRequestDto.id)
                ?: throw RuntimeException();
        post.update(modifyPostRequestDto);
    }
}