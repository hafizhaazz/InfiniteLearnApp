package com.example.infinitelearnapp.data

data class Meal (
    val id: Int,
    val title: String,
    val description: String,
    val mealImageId: Int = 0
)