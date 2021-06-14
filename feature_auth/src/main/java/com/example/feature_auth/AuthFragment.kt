package com.example.feature_auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.feature_auth.databinding.AuthFragmentBinding
import com.example.feature_auth.navigation.AuthNavActions
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AuthFragment : Fragment(R.layout.auth_fragment) {
    private val viewModel: AuthViewModel by viewModels()
    private val binding by viewBinding(AuthFragmentBinding::bind)

    @Inject
    lateinit var authNavActions: AuthNavActions

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.navigationButton.setOnClickListener {
            authNavActions.navigateToCamera("Cuz I wanna")
        }
    }
}