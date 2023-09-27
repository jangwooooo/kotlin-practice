package com.example.kotlinpractice.service

import com.example.kotlinpractice.dto.AddPostRequestDto
import com.example.kotlinpractice.entity.Post
import com.example.kotlinpractice.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class CreateService(
    private val postRepository: PostRepository
) {

    fun execute(addPostRequestDto: AddPostRequestDto) {
        val post: Post = Post(
            title = addPostRequestDto.title,
                category = addPostRequestDto.category
        );

        postRepository.save(post);
    }
}