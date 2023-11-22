package com.example.businessconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.businessconnect.databinding.ActivitySignInBinding

class SignInAct : AppCompatActivity() {
    lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignInBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun onClickSignUp(view: View){
        val i = Intent(this, SignUpAct::class.java)
        startActivity(i)
    }
}

