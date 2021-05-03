package ru.wakesoft.eweather.ui.fragment.splash

import androidx.lifecycle.ViewModelProvider
import dagger.Subcomponent
import ru.wakesoft.eweather.di.dagger2.scope.FragmentScope

@FragmentScope
@Subcomponent(modules = [SplashFragmentModule::class])
interface SplashFragmentSubcomponent {
    fun viewModelFactory(): ViewModelProvider.Factory
}