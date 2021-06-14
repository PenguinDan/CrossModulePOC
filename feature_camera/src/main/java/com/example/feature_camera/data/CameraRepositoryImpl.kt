package com.example.feature_camera.data

import android.content.Context
import android.widget.Toast
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import javax.inject.Inject

class CameraRepositoryImpl @Inject constructor(
    @ApplicationContext private val appContext: Context,
    private val retrofit: Retrofit
) : CameraRepository {
    override fun uploadPicture() {
        Toast.makeText(appContext, "Picture Uploaded", Toast.LENGTH_SHORT).show()
    }
}