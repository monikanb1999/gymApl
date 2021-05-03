package com.example.gymapplication.ui.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.gymapplication.R
import com.example.gymapplication.RegisterHandler
import com.example.gymapplication.databinding.ActivityEditableHomeBinding
import com.example.gymapplication.databinding.ActivityRegisterBinding
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.ui.home.HomeFragment
import com.example.gymapplication.ui.home.HomeViewModel

class RegisterActivity : AppCompatActivity(),RegisterHandler {
    lateinit var binding: ActivityRegisterBinding
    lateinit var gender :String

    private val registerviewmodel: HomeViewModel by lazy {
        ViewModelProvider(this).get(HomeViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.regsave = this
//        startActivity(Intent(this, HomeActivity::class.java))

    }

    override fun onRegisterSavedClicked(view: View) {
        Log.d("Register", "onRegisterSavedClicked: ")
        if (!TextUtils.isEmpty(binding.regname.text.toString())) {

            val table = CustomerDetails(
                0,binding.regname.text.toString(),
                binding.regheight.text.toString(),
                binding.regweight.text.toString(),
                binding.regtargetedweight.text.toString(),
                gender,
                binding.regage.text.toString(),
            )
            registerviewmodel.inserttable(table)
            startActivity(Intent(this, HomeActivity::class.java))
            Toast.makeText(this, "done the process", Toast.LENGTH_LONG).show()
        } else {

            Toast.makeText(this, "not done process", Toast.LENGTH_LONG).show()
        }
    }

    override fun onRegRadiofemaleButtonClicked(view: View)
    { gender="female"    }

    override fun onRegRadiomaleButtonClicked(view: View)
    { gender="male"    }

    override fun onRegRadiootherButtonClicked(view: View)
    { gender="others"    }
}