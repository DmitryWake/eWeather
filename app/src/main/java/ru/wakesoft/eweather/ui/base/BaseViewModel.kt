package ru.wakesoft.eweather.ui.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel

// Обертка над ViewModel. Используется в FragmentWithViewModel
abstract class BaseViewModel : ViewModel(), LifecycleObserver {

    private var isStarted = false

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun onFragmentCreated() {
        if (!isStarted) {
            onStart()
            isStarted = false
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private fun onFragmentDestroy() {

    }

    protected abstract fun onStart()

}