package ru.wakesoft.eweather.ui.activity

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides

@Module
class MainModule(private val activity: MainActivity) {
    @Provides
    fun activity() = activity as Activity

    @Provides
    fun mainActivity() = activity

    @Provides
    fun appCompatActivity() = activity as AppCompatActivity
}