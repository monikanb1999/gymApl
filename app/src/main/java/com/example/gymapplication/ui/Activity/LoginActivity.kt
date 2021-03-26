package com.example.gymapplication.ui.Activity

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gymapplication.R

class LoginActivity : AppCompatActivity() {
    var sharedpreferences: SharedPreferences? = null
    val MyPREFERENCES = "MyPREFERENCE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        sharedpreferences = getSharedPreferences(
           MyPREFERENCES, MODE_PRIVATE
        )
    }
}