package com.example.gymapplication.ui.Activity

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gymapplication.R
import com.example.gymapplication.databinding.ActivityFoodDetailsBinding
import com.example.gymapplication.databinding.FoodlistBinding
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.ui.foods.FoodsViewModel

class FoodDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityFoodDetailsBinding
    private lateinit var adapter: RecyclerAdapter

    private val viewmodel: FoodsViewModel by lazy {
        ViewModelProvider(this).get(FoodsViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodDetailsBinding.inflate(layoutInflater)


        adapter = RecyclerAdapter(this)
        binding.listadapter?.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.listadapter?.layoutManager = layoutManager
        binding.listadapter?.adapter = adapter

        viewmodel.gymfooddetaillist.observe(this, androidx.lifecycle.Observer {

        })
        }
    }

        class RecyclerAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>(){
            private val BreakFast=1
            private val Snacks=2
            private val Lunch=3
            private val Dinner=4
            private val inflater: LayoutInflater = LayoutInflater.from(context)
            var gymfooddetaillist = emptyList<CustomerDetails>()
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
                TODO("Not yet implemented")
            }

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                TODO("Not yet implemented")
            }

            override fun getItemCount(): Int {
                return gymfooddetaillist.size
            }
            override fun getItemViewType(position: Int): Int {
                when(gymfooddetaillist[position].Height) {
                    "breakfast" -> return BreakFast
                    "snacks" -> return Snacks
                    "lunch" -> return Lunch
                    "dinner" -> return Dinner

                }
                return super.getItemViewType(position)
            }
        }


    }




