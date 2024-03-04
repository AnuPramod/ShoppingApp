package com.example.shoppingapp.home.domain.repository

import arrow.core.Either
import com.example.shoppingapp.home.domain.model.NetworkError
import com.example.shoppingapp.home.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    suspend fun getProducts(): Either<NetworkError, List<Product>>
}