package com.example.kotlinpractice.entity

import com.example.kotlinpractice.dto.ModifyPostRequestDto
import jakarta.persistence.*

@Entity
class Post (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        var title: String,

        @Enumerated(EnumType.STRING)
        var category: Category

) {
        fun update(modifyPostRequestDto: ModifyPostRequestDto) {
                this.title = modifyPostRequestDto.title;
                this.category = modifyPostRequestDto.category;
        }
}