package com.example.gymapplication.ui.Activity

import android.app.ProgressDialog.show
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.gymapplication.HomeDetails
import com.example.gymapplication.R
import com.example.gymapplication.databinding.ActivityEditableHomeBinding
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.ui.home.HomeViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_editable_home.view.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.lunch.view.*
import java.util.*

class EditableHomeActivity : AppCompatActivity(),HomeDetails {
    lateinit var binding: ActivityEditableHomeBinding
    lateinit var gender :String

    val viewModel: HomeViewModel by lazy {
        ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editable_home)
        binding = ActivityEditableHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.edithandler = this

    }


    override fun onDoneClicked(view: View) {
        Log.d("done", "onDoneClicked: ")
        if (!TextUtils.isEmpty(binding.etheight.text.toString())) {

            val table = CustomerDetails(
                    0, binding.etheight.text.toString(),
                    binding.etweight.text.toString(),
                    binding.ettargetweight.text.toString(),
                    gender,
                    binding.etdateofbirth.text.toString(),
            )
            viewModel.inserttable(table)
            viewModel.updatetable(table)
            startActivity(Intent(this, HomeActivity::class.java))
            Toast.makeText(this, "done the process", Toast.LENGTH_LONG).show()
        } else {

            Toast.makeText(this, "not done process", Toast.LENGTH_LONG).show()
        }
    }

    override fun onRadioButtonClicked(view: View) {

        if (view is RadioButton) {
                // Is the button now checked?
                val checked = view.isChecked
                // Check which radio button was clicked
                when (view.getId()) {
                    R.id.male ->
                        if (checked) {
                          print("male")
                            Toast.makeText(this,"male",Toast.LENGTH_LONG).show()
                        }
                    R.id.female ->
                        if (checked) {
                            print("female")
                            Toast.makeText(this,"female",Toast.LENGTH_LONG).show()
                        }
                }
            }
    }

    override fun onRadiofemaleButtonClicked(view: View) {
        gender="female"
    }

    override fun onRadiomaleButtonClicked(view: View) {
       gender="male"
    }

    override fun onRadiootherButtonClicked(view: View) {
        gender="others"
    }
}
