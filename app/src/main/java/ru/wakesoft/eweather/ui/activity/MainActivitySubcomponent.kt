package ru.wakesoft.eweather.ui.activity

import dagger.Subcomponent
import ru.wakesoft.eweather.di.dagger2.scope.ActivityScope
import ru.wakesoft.eweather.ui.fragment.splash.SplashFragmentSubcomponent

@ActivityScope
@Subcomponent(modules = [MainModule::class])
interface MainActivitySubcomponent {
    fun splashComponent(): SplashFragmentSubcomponent
    fun inject(activity: MainActivity)
}