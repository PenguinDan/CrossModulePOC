package com.example.cross_module_poc

import com.example.core.BaseApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CrossModulePocApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
    }
}