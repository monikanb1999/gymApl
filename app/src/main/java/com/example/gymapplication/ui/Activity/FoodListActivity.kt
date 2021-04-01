package com.example.gymapplication.ui.Activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gymapplication.R
import com.example.gymapplication.databinding.*
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.ui.foods.FoodsFragment
import com.example.gymapplication.ui.foods.FoodsViewModel
import java.util.Observer

class FoodListActivity : AppCompatActivity() {

    lateinit var binding: ActivityFoodListBinding
    private lateinit var adapter: RecyclerView


    val viewmodel: FoodsViewModel by lazy {
        ViewModelProvider(this).get(FoodsViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = RecyclerView(this)
        binding.recyclerView?.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.recyclerView?.layoutManager = layoutManager
//        binding.recyclerView?.adapter =Recycle
        viewmodel.gymfooddetaillist.observe(this, androidx.lifecycle.Observer {

        })
    }

    private inner class ListAdapter internal constructor(
            private val context: Context,
            val fragment: FoodsFragment
    ) :
            RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        private val Breakfast = 1
        private val Snacks = 2
        private val Lunch = 3
        private val Dinner = 4

        private val inflater: LayoutInflater = LayoutInflater.from(context)
        var gymfooddetaillist = emptyList<CustomerDetails>()

        inner class ShowBreakFastViewHolder(rowitemBinding: RowitemBinding) : RecyclerView.ViewHolder(binding.root)
        inner class ShowSnacksViewHolder(anotherrowitemBinding: AnotherrowitemBinding) : RecyclerView.ViewHolder(binding.root)
        inner class ShowLunchViewHolder(lunchBinding: LunchBinding) : RecyclerView.ViewHolder(binding.root)
        inner class ShowDinnerViewHolder(dinnerBinding: DinnerBinding) : RecyclerView.ViewHolder(binding.root)

        override fun getItemViewType(position: Int): Int {
            when (gymfooddetaillist[position].Height) {
                "Breakfast" -> return Breakfast
                "Snacks" -> return Snacks
                "Lunch" -> return Lunch
                "Dinner" -> return Dinner
            }
            return super.getItemViewType(position)
        }
        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
          if (getItemViewType(position)==Breakfast){
              (holder as ShowBreakFastViewHolder)
          }
            if (getItemViewType(position)==Snacks){
                (holder as ShowSnacksViewHolder)
            }
            if (getItemViewType(position)==Lunch){
                (holder as ShowLunchViewHolder)
            }
            if (getItemViewType(position)==Dinner){
                (holder as ShowDinnerViewHolder)
            }
        }

        override fun getItemCount(): Int {
            return gymfooddetaillist.size
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            when (viewType) {
                Breakfast -> {
                    val rowitemBinding: RowitemBinding = DataBindingUtil.inflate(inflater, R.layout.rowitem, parent, false)
                    return ShowBreakFastViewHolder(rowitemBinding)
                }
                Snacks -> {
                    val anotherrowitemBinding: AnotherrowitemBinding = DataBindingUtil.inflate(inflater, R.layout.anotherrowitem, parent, false)
                    return ShowSnacksViewHolder(anotherrowitemBinding)
                }
                Lunch -> {
                    val lunchBinding: LunchBinding = DataBindingUtil.inflate(inflater, R.layout.lunch, parent, false)
                    return ShowLunchViewHolder(lunchBinding)
                }
                Dinner -> {
                    val dinnerBinding: DinnerBinding = DataBindingUtil.inflate(inflater, R.layout.dinner, parent, false)
                    return ShowDinnerViewHolder(dinnerBinding)
                }
            }

        }


    }
}