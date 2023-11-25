package com.example.businessconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.businessconnect.databinding.ActivitySplashRegBinding

class SplashReg : AppCompatActivity() {
    lateinit var binding: ActivitySplashRegBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySplashRegBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun onClickGreat(view: View){
        val i = Intent(this, MainMenu::class.java)
        startActivity(i)
    }
}