package com.example.kotlinpractice.dto

import com.example.kotlinpractice.entity.Category

data class ModifyPostRequestDto (
        val id: Long,
        val title: String,
        val category: Category
)