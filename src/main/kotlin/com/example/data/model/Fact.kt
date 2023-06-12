package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Fact(
    val name: String,
    val fact: String,
    val image: String
)
