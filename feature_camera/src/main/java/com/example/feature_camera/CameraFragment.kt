package com.example.feature_camera

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.feature_camera.databinding.CameraFragmentBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CameraFragment : Fragment(R.layout.camera_fragment) {
    private val binding by viewBinding(CameraFragmentBinding::bind)
    private val viewModel: CameraViewModel by viewModels()

    @Inject
    lateinit var cameraTakerFactory: CameraTaker.AssistedFactory
    private lateinit var cameraTaker: CameraTaker

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.uploadPictureButton.setOnClickListener {
            viewModel.uploadPicture()
        }

        // Assisted inject beauty!
        cameraTaker = cameraTakerFactory.create(view)
        cameraTaker.uselessMethod()

        initObservables()
    }

    private fun initObservables() {
        viewModel.viewStateLiveData.observe(viewLifecycleOwner) { viewState ->
            binding.startedReason.text = "Reason Started: ${viewState.reasonStarted}"
        }
    }
}