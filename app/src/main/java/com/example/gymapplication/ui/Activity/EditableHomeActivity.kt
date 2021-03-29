package com.example.gymapplication.ui.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.gymapplication.HomeDetails
import com.example.gymapplication.R
import com.example.gymapplication.databinding.ActivityEditableHomeBinding
import com.example.gymapplication.databinding.ActivityLoginBinding
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.ui.home.HomeViewModel

class EditableHomeActivity : AppCompatActivity(),HomeDetails{
    lateinit var binding: ActivityEditableHomeBinding
    val viewModel: HomeViewModel by lazy {
        ViewModelProvider(this).get(HomeViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editable_home)
        binding = ActivityEditableHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.edithandler=this
    }

    override fun onDoneClicked(view: View) {
        Log.d("done", "onDoneClicked: ")
        if (!TextUtils.isEmpty(binding.etheight.text.toString())) {
            val table = CustomerDetails(
                0, binding.etheight.text.toString(),
                binding.etweight.text.toString(),
                binding.ettargetweight.text.toString(),
                binding.etgender.text.toString(),
                binding.etdateofbirth.text.toString(),
                )
            viewModel.inserttable(table)
            Toast.makeText(this,"done the process", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "not done process", Toast.LENGTH_LONG).show()
        }
        }
    }