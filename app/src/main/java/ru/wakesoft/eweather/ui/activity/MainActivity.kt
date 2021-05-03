package ru.wakesoft.eweather.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.wakesoft.eweather.app.App
import ru.wakesoft.eweather.databinding.ActivityMainBinding
import ru.wakesoft.eweather.helpers.delegate.ToolbarDelegate
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    val binding: ActivityMainBinding
        get() = _binding!!

    @Inject
    lateinit var toolbarDelegate: ToolbarDelegate

    private lateinit var component: MainActivitySubcomponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component = App.appComponent.mainActivitySubcomponent(MainModule(this))
        component.inject(this)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toolbarDelegate.init()
    }

    fun getComponent() = component

}