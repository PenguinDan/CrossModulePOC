package com.example.feature_camera

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.camera_activity)
    }

    companion object {
        fun startActivity(activity: Activity) {
            val intent = Intent(activity, CameraActivity::class.java)
            activity.startActivity(intent)
        }
    }
}