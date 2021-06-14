package com.example.feature_camera

import android.content.Context
import android.view.View
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import dagger.hilt.android.qualifiers.ApplicationContext

class CameraTaker @AssistedInject constructor(
    @ApplicationContext private val appContext: Context,
    // Don't do this, please, example only
    @Assisted private val view: View
) {

    fun uselessMethod() {
    }

    @dagger.assisted.AssistedFactory
    interface AssistedFactory {
        fun create(view: View): CameraTaker
    }
}