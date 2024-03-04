package com.example.shoppingapp.home.domain.model

import android.media.Rating

data class Product (
    val id:Int,
    val name:String,
    val price: Double,
    val rating : Rating
)

data class Rating(
    val count:Int,
    val range :Double
)