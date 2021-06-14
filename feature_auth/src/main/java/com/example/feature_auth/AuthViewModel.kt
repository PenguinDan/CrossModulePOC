package com.example.feature_auth

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.network.di.KoreanParser
import com.example.network.di.Parser
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    @ApplicationContext appContext: Context,
    @KoreanParser parser: Parser,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    init {
        Authenticator().doSomething(appContext)
        parser.parse()
    }
}