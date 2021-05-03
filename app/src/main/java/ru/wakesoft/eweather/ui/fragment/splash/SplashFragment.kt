package ru.wakesoft.eweather.ui.fragment.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import ru.wakesoft.eweather.databinding.FragmentSplashBinding
import ru.wakesoft.eweather.ui.activity.MainActivity
import ru.wakesoft.eweather.ui.activity.MainActivitySubcomponent
import ru.wakesoft.eweather.ui.base.BaseViewModel
import ru.wakesoft.eweather.ui.base.FragmentWithViewModel
import javax.inject.Inject

class SplashFragment @Inject constructor() : FragmentWithViewModel<SplashFragmentSubcomponent>() {

    private var _binding: FragmentSplashBinding? = null
    private val binding: FragmentSplashBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)

        (activity as MainActivity).apply {
            toolbarDelegate.setVisibility(false)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun createComponent(): SplashFragmentSubcomponent {
        return (activity as MainActivity).getComponent().splashComponent()
    }

    override fun createViewModel(): BaseViewModel {
        return ViewModelProviders.of(this, component.viewModelFactory())
            .get(SplashViewModel::class.java)
    }
}