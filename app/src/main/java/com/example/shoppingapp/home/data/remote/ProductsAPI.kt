package com.example.shoppingapp.home.data.remote

import com.example.shoppingapp.home.domain.model.Product
import retrofit2.http.GET

interface ProductsAPI {
    @GET("products")
    suspend fun getProducts():List<Product>
}