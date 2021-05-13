package com.example.cross_module_poc.featurecamera.di

import com.example.cross_module_poc.featurecamera.FeatureCameraActionsImpl
import com.example.feature_camera.FeatureCameraActions
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class FeatureAuthModule {

    @Binds
    @Singleton
    abstract fun bindFeatureCameraActions(
        featureCameraActionsImpl: FeatureCameraActionsImpl
    ): FeatureCameraActions
}