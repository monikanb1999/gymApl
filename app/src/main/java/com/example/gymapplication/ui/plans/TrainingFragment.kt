package com.example.gymapplication.ui.plans

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import com.example.gymapplication.BeginHandler
import com.example.gymapplication.R
import com.example.gymapplication.databinding.ActivityEditableHomeBinding
import com.example.gymapplication.databinding.FragmentNotificationsBinding
import com.example.gymapplication.databinding.FragmentTrainingBinding

class TrainingFragment : Fragment(),BeginHandler {

    lateinit var binding: FragmentTrainingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTrainingBinding.inflate(layoutInflater)
        binding.beginplan = this
        binding.interplan =this
        binding.advanceplan=this
        return binding.root
    }

    override fun onBeginnerClicked(view: View) {
            val intent = Intent(context, BeginnerPlanActivity::class.java)
            startActivity(intent)
        }

    override fun onIntermediateClicked(view: View) {
        val intent = Intent(context, IntermediatePlanActivity::class.java)
        startActivity(intent)
    }

    override fun onAdvancedClicked(view: View) {
        val intent = Intent(context, AdvancedPlanActivity::class.java)
        startActivity(intent)
    }

}