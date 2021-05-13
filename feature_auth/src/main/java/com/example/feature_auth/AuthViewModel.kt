package com.example.feature_auth

import android.app.Activity
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val featureAuthActions: FeatureAuthActions
) : ViewModel() {

    fun navigateToCamera(activity: Activity) {
        featureAuthActions.navigateToCamera(activity)
    }
}