package com.example.cross_module_poc.featureauth.di

import com.example.cross_module_poc.featureauth.FeatureAuthActionsImpl
import com.example.feature_auth.FeatureAuthActions
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
    abstract fun bindFeatureAuthActions(
        featureAuthActionsImpl: FeatureAuthActionsImpl
    ): FeatureAuthActions
}