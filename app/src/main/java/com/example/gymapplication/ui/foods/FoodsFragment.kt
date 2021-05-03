package com.example.gymapplication.ui.foods

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gymapplication.BR
import com.example.gymapplication.FoodDetails
import com.example.gymapplication.R
import com.example.gymapplication.databinding.FoodrecordBinding
import com.example.gymapplication.databinding.FragmentNotificationsBinding
import com.example.gymapplication.databinding.JumpingjacksBinding
import com.example.gymapplication.ui.Activity.FoodListActivity

class FoodsFragment : Fragment(), FoodDetails {

    lateinit var binding: FragmentNotificationsBinding
    private lateinit var foodsViewModel: FoodsViewModel
    private lateinit var adapter: FoodRecyclerAdapter


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        foodsViewModel =
                ViewModelProvider(this).get(FoodsViewModel::class.java)

        binding = FragmentNotificationsBinding.inflate(layoutInflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = FoodRecyclerAdapter(context,this)
        binding.foodrecyclerview?.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        binding.foodrecyclerview?.layoutManager = layoutManager
        binding.foodrecyclerview?.adapter = adapter

    }

     class FoodRecyclerAdapter(val context: Context?, private val foodsFragment: FoodsFragment) : RecyclerView.Adapter<FoodRecyclerAdapter.FoodViewHolder>() {

        private val inflater: LayoutInflater = LayoutInflater.from(context)
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
            val binding: FoodrecordBinding = DataBindingUtil.inflate(inflater, R.layout.foodrecord, parent, false)
            return FoodViewHolder((binding))
        }

        override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
            holder.binding.tvtext.text = "DAY" + "-" + (position + 1)
//            holder.binding.setVariable(BR.foodhandler,foodsFragment)
            holder.binding.recyclerfood.setOnClickListener{
//                Toast.makeText(context, "thifdj$position",Toast.LENGTH_LONG).show()
                val intent=Intent(context,FoodListActivity::class.java)
                intent.putExtra("position",position + 1)
                context!!.startActivity(intent)
            }
            holder.binding.executePendingBindings()
        }


        override fun getItemCount(): Int {
            return 30
        }

        inner class FoodViewHolder(val binding: FoodrecordBinding) : RecyclerView.ViewHolder(binding.root)

    }

    override fun onFoodClick(daynumber: Int) {

    }

    override fun onFoodDetailsClicked(view: View) {
//        val intent = Intent(context, FoodListActivity::class.java)
//
//        startActivity(intent)
    }


}



