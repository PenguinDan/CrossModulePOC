package com.example.feature_camera.di

import com.example.feature_camera.data.CameraRepository
import com.example.feature_camera.data.CameraRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class CameraModule {
    @Binds
    abstract fun cameraRepository(cameraRepositoryImpl: CameraRepositoryImpl): CameraRepository
}