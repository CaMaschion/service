package com.maschion.service

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.maschion.service.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            startButton.setOnClickListener {
                startService(Intent(this@MainActivity, ExampleService::class.java))
            }

            stopButton.setOnClickListener {
                stopService(Intent(this@MainActivity, ExampleService::class.java))
            }
        }

    }
}
