package com.example.shoppingapp.home.presentation.homescreen

import com.example.shoppingapp.home.domain.model.Product

data class ProductViewState (
    val loading:Boolean = false,
    val products : List<Product> = emptyList(),
    val error:String?=null
)