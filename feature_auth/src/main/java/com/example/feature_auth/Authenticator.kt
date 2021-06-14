package com.example.feature_auth

import android.content.Context
import dagger.hilt.EntryPoint
import dagger.hilt.EntryPoints
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

class Authenticator {

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface AuthenticatorEntryPoint {
        fun getRetrofit(): Retrofit
    }

    fun doSomething(context: Context) {
        val retrofit = EntryPoints.get(
            context.applicationContext, AuthenticatorEntryPoint::class.java
        ).getRetrofit()
    }
}