package com.example.feature_camera

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.feature_camera.data.CameraRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class CameraViewModel @Inject constructor(
    @ApplicationContext appContext: Context,
    savedStateHandle: SavedStateHandle,
    private val cameraRepository: CameraRepository
) : ViewModel() {
    data class ViewState(
        val reasonStarted: String = ""
    )

    private val _viewStateLiveData = MutableLiveData<ViewState>()
    val viewStateLiveData: LiveData<ViewState> = _viewStateLiveData

    init {
        _viewStateLiveData.value = ViewState(
            reasonStarted = savedStateHandle.get<String>("reason")!!
        )
    }

    fun uploadPicture() {
        cameraRepository.uploadPicture()
    }
}