package com.example.verticalchainbuttons

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.example.verticalchainbuttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        binding.toggleA.setOnClickListener {
            run {
                if (binding.buttonA.isVisible) {
                    binding.buttonA.visibility = View.GONE
                } else {
                    binding.buttonA.visibility = View.VISIBLE
                }
            }
        }

        binding.toggleB.setOnClickListener {
            run {
                if (binding.buttonB.isVisible) {
                    binding.buttonB.visibility = View.GONE
                } else {
                    binding.buttonB.visibility = View.VISIBLE
                }
            }
        }

        binding.toggleC.setOnClickListener {
            run {
                if (binding.buttonC.isVisible) {
                    binding.buttonC.visibility = View.GONE
                } else {
                    binding.buttonC.visibility = View.VISIBLE
                }
            }
        }
    }
}