package com.example.member

import kotlinx.serialization.Serializable

@Serializable
data class Member(
    val name: String,
    val age: Int,
)
