package ru.wakesoft.eweather.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.wakesoft.eweather.databinding.ActivityMainBinding
import ru.wakesoft.eweather.helpers.delegate.ToolbarDelegate

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding!!

    lateinit var toolbarDelegate: ToolbarDelegate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        toolbarDelegate = ToolbarDelegate(this)
        toolbarDelegate.init()
        toolbarDelegate.setVisibility(false)
    }
}