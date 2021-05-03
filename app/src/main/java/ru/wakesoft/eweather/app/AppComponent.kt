package ru.wakesoft.eweather.app

import dagger.Component
import ru.wakesoft.eweather.ui.activity.MainActivitySubcomponent
import ru.wakesoft.eweather.ui.activity.MainModule

@Component(
    modules = [AppModule::class]
)
interface AppComponent {
    fun mainActivitySubcomponent(mainModule: MainModule): MainActivitySubcomponent
}