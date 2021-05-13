package com.example.cross_module_poc.featureauth

import android.app.Activity
import com.example.feature_auth.FeatureAuthActions
import com.example.feature_camera.CameraActivity
import javax.inject.Inject

class FeatureAuthActionsImpl @Inject constructor() : FeatureAuthActions {
    override fun navigateToCamera(activity: Activity) {
        CameraActivity.startActivity(activity)
    }
}