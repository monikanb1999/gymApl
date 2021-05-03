package com.example.gymapplication.ui.plans

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.gymapplication.R
import com.example.gymapplication.databinding.FoodrecordBinding
import com.example.gymapplication.databinding.FragmentDashboardBinding
import com.example.gymapplication.ui.Activity.FoodListActivity
import com.example.gymapplication.ui.foods.FoodsFragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_dashboard.*
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

        plansViewModel.gymplandetaillist.observe(viewLifecycleOwner, Observer {

        })

        val viewPagerAdapter = MyViewPagerAdapter(this)
        binding.pager.adapter = viewPagerAdapter
        TabLayoutMediator(tablayout,pager){ tab, position ->
            when (position) {
                0 -> { tab.text = "TRAINING"}
                1 -> { tab.text = "TROUBLEZONE"}
            }
        }.attach()

    }

//    override fun onFoodClick(daynumber: Int) {
//
//    }
//
//    override fun onFoodDetailsClicked(view: View) {
////        val intent = Intent(context, FoodListActivity::class.java)
////
////        startActivity(intent)
//    }

}






