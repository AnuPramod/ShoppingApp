package com.example.shoppingapp.di

import com.example.shoppingapp.home.data.repository.ProductRepositoryImpl
import com.example.shoppingapp.home.domain.repository.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun provideProductsRepository(impl: ProductRepositoryImpl): ProductRepository

}