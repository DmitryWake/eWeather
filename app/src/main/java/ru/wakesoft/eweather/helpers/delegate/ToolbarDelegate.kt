package ru.wakesoft.eweather.helpers.delegate

import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import ru.wakesoft.eweather.di.dagger2.scope.ActivityScope
import ru.wakesoft.eweather.ui.activity.MainActivity
import javax.inject.Inject

@ActivityScope
class ToolbarDelegate @Inject constructor(private val activity: MainActivity) {

    private lateinit var toolbar: androidx.appcompat.widget.Toolbar

    fun init() {
        toolbar = activity.binding.mainToolbar
    }

    fun setVisibility(isVisible: Boolean) {
        toolbar.visibility = if (isVisible) View.VISIBLE else View.GONE
    }

}