package com.example.gymapplication.ui.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gymapplication.databinding.ActivityLoginBinding
import com.example.gymapplication.databinding.ActivitySignUpBinding
import com.example.gymapplication.signuphandler

class SignUpActivity : AppCompatActivity(), signuphandler {
    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onsignupclicked(view: View) {
        startActivity(Intent(this, RegisterActivity::class.java))
        finish()
    }
}