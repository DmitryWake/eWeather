package ru.wakesoft.eweather.ui.base

import android.os.Bundle
import androidx.fragment.app.Fragment

// Фрагмент с компонентом и base view model
abstract class FragmentWithViewModel<Component> : Fragment() {

    protected val viewModel: BaseViewModel by lazy {
        createViewModel()
    }
    protected val component: Component by lazy {
        createComponent()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(viewModel)
    }

    protected abstract fun createViewModel(): BaseViewModel
    protected abstract fun createComponent(): Component
}