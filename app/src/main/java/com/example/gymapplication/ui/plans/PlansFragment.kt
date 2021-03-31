package com.example.gymapplication.ui.plans

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.gymapplication.databinding.FragmentDashboardBinding
import com.google.android.material.tabs.TabLayoutMediator
import java.util.*

class PlansFragment : Fragment() {
    private lateinit var plansViewModel: PlansViewModel
    lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        plansViewModel =
                ViewModelProvider(this).get(PlansViewModel::class.java)
        binding= FragmentDashboardBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        var list: ArrayList<String> = ArrayList()
//        list.add("First Screen")
//        list.add("Second Screen")

        plansViewModel.text.observe(viewLifecycleOwner, Observer {

        })

        val viewPagerAdapter = MyViewPagerAdapter(this)
        binding.pager.adapter = viewPagerAdapter
        TabLayoutMediator(binding.tablayout,binding.pager) { _, _ -> }.attach()

    }
    }






