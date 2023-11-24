package com.example.businessconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.businessconnect.databinding.ActivitySignInBinding
import com.example.businessconnect.databinding.ActivitySignUpBinding

class SignUpAct : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun onClickSplashReg(view: View){
        val i = Intent(this, SplashReg::class.java)
        startActivity(i)
    }
}