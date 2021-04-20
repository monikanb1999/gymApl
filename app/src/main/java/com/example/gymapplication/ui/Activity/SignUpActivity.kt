package com.example.gymapplication.ui.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gymapplication.databinding.ActivityLoginBinding
import com.example.gymapplication.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.handler=this
    }
}