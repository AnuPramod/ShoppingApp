package com.example.shoppingapp.home.data.repository

import arrow.core.Either
import com.example.shoppingapp.home.data.mapper.toGeneralError
import com.example.shoppingapp.home.data.remote.ProductsAPI
import com.example.shoppingapp.home.domain.model.NetworkError
import com.example.shoppingapp.home.domain.model.Product
import com.example.shoppingapp.home.domain.repository.ProductRepository

class ProductRepositoryImpl constructor(
    private val productsAPI: ProductsAPI
):ProductRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsAPI.getProducts()
        }.mapLeft {
            it.toGeneralError()
        }
    }
}