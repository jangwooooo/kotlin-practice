package com.example.kotlinpractice.repository

import com.example.kotlinpractice.entity.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : JpaRepository<Post, Long>{
}