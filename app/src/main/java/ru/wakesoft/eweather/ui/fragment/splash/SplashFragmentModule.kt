package ru.wakesoft.eweather.ui.fragment.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import javax.inject.Provider

@Suppress("UNCHECKED_CAST")
@Module
class SplashFragmentModule {
    @Provides
    fun viewModelFactory(splashProvider: Provider<SplashViewModel>): ViewModelProvider.Factory {
        return object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return splashProvider.get() as T
            }
        }
    }
}