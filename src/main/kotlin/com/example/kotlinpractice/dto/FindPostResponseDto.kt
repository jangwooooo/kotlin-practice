package com.example.kotlinpractice.dto

import com.example.kotlinpractice.entity.Category

data class FindPostResponseDto (
        val title: String,
        val category: Category
)