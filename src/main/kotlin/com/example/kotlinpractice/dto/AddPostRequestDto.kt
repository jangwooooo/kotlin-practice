package com.example.kotlinpractice.dto

import com.example.kotlinpractice.entity.Category

data class AddPostRequestDto (
        val title: String,
        val category: Category
)