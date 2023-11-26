package com.example.businessconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import com.example.businessconnect.databinding.ActivityMainMenuBinding

class MainMenu : AppCompatActivity() {
    lateinit var binding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply{
            navView.setNavigationItemSelectedListener {
                true
            }
            open.setOnClickListener{
                drawer.openDrawer(GravityCompat.END)
            }
        }

        

    }
}