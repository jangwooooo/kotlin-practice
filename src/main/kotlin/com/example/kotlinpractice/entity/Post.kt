package com.example.kotlinpractice.entity

import jakarta.persistence.*

@Entity
class Post (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,

        val title: String,

        @Enumerated(EnumType.STRING)
        val category: Category
)