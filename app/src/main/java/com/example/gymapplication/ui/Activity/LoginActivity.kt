package com.example.gymapplication.ui.Activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gymapplication.R
import com.example.gymapplication.databinding.ActivityLoginBinding
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.LogHandler
import com.example.gymapplication.ui.home.HomeFragment
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),LogHandler {
    lateinit var binding: ActivityLoginBinding
    val MyPREFERENCES = "MyPREFERENCE"
    val sharedPreferences: SharedPreferences by lazy {
        getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.handler=this

    }

    override fun onSaveClicked(view: View) {
//        startActivity(Intent(this, HomeActivity::class.java))
//        finish()
        if(!TextUtils.isEmpty(binding.etname.text.toString())) {
//            Log.d("save", "onSaveClicked: ")
            binding.topiclog.text.toString()
            binding.etname.text.toString()
            binding.etpassword.text.toString()

            sharedPreferences.edit().putBoolean(SplashActivity.STATUS_LOGIN, true).apply()
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }
    else
    {
        Toast.makeText(this, "exited without inserting", Toast.LENGTH_LONG).show()

    }
    }

    override fun onSignUpClicked(view: View) {
        startActivity(Intent(this, RegisterActivity::class.java))
        finish()
    }


//    override fun onSaveClicked(view: View) {
//        binding.topiclog.text.toString()
//        binding.etname.text.toString()
//        binding.etpassword.text.toString()
//
//        sharedPreferences.edit().putBoolean(SplashActivity.STATUS_LOGIN, true).apply()
//        startActivity(Intent(this, LoginActivity::class.java))
//        startActivity(intent)
//        finish()
//    }
//
//    override fun onResetClicked(view: View) {
//        etname.setText("")
//        etpassword.setText("")
//        Toast.makeText(this, "OK CHILL!!!YOU CAN RESET AGAIN", Toast.LENGTH_LONG).show()
//    }
}


//    preferences.edit().putBoolean(SplashActivity.STATUS_LOGIN, true).apply()
