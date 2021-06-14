package com.example.cross_module_poc.featureauth.di

import com.example.cross_module_poc.ModuleNavigator
import com.example.feature_auth.navigation.AuthNavActions
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class FeatureAuthModule {
    @Binds
    abstract fun authNavigator(moduleNavigator: ModuleNavigator): AuthNavActions
}