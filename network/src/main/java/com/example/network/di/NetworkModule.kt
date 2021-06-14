package com.example.network.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Qualifier
import javax.inject.Singleton

@Qualifier
annotation class KoreanParser

@Qualifier
annotation class JapaneseParser

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit = Retrofit.Builder().baseUrl("https://0.0.0.0").build()

    @KoreanParser
    @Provides
    fun koreanParser(): Parser = Parser()

    @JapaneseParser
    @Provides
    fun japaneseParser(): Parser = Parser()
}