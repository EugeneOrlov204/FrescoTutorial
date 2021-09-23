package com.shpp.eorlov.frescotutorial.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shpp.eorlov.frescotutorial.R
import com.shpp.eorlov.frescotutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setImage()
    }

    private fun setImage() {
        binding.simpleDraweeViewImage.setImageURI("https://interactive-examples.mdn.mozilla.net/media/cc0-images/grapefruit-slice-332-332.jpg")
    }
}