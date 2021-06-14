package com.example.cross_module_poc

import androidx.navigation.NavController
import com.example.feature_auth.navigation.AuthNavActions
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ModuleNavigator @Inject constructor(
    private val navController: NavController,
) : AuthNavActions {
    override fun navigateToCamera(reason: String) {
        navController.navigate(NavigationRootDirections.actionAuthToCamera(reason))
    }
}