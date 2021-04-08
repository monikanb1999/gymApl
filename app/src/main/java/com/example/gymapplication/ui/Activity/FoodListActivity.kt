package com.example.gymapplication.ui.Activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gymapplication.R
import com.example.gymapplication.databinding.*
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.ui.foods.FoodsViewModel

class FoodListActivity : AppCompatActivity() {
    lateinit var binding: ActivityFoodListBinding
    var daynumber:Int=0


    val viewmodel: FoodsViewModel by lazy {
        ViewModelProvider(this).get(FoodsViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodListBinding.inflate(layoutInflater)
        setContentView(binding.root)
         daynumber= intent!!.extras?.get("position") as Int
        Log.d("daynumber", "onCreate: $daynumber")
        val adapter = ListAdapter1(this)
        binding.recyclerView.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView?.adapter =adapter
        viewmodel.gymfooddetaillist.observe(this, {

        })
    }

     private inner class ListAdapter1 internal constructor(
            context: Context
    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        private val Breakfast = 0
        private val Snacks = 1
        private val Lunch = 2
        private val Dinner = 3

        private val inflater: LayoutInflater = LayoutInflater.from(context)
//        var gymfooddetaillist = emptyList<CustomerDetails>()

        override fun getItemViewType(position: Int): Int {
            when (position) {
                0 -> return Breakfast
                1 -> return Snacks
                2 -> return Lunch
                3 -> return Dinner
            }
            return super.getItemViewType(position)
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            if (getItemViewType(position) == Breakfast) {
                (holder as ShowBreakFastViewHolder)
                when(daynumber){
                    1->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst1a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst1b)

                    }
                }
                holder.rowitemBinding.executePendingBindings()
            }
            if (getItemViewType(position) == Snacks) {
                (holder as ShowSnacksViewHolder)
                when(daynumber){
                    1-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack1a)
                    }
                    }
                holder.anotherrowitemBinding.executePendingBindings()
            }
            if (getItemViewType(position) == Lunch) {
                (holder as ShowLunchViewHolder)
                when(daynumber) {
                    1 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                }
                holder.lunchBinding.executePendingBindings()
            }
            if (getItemViewType(position) == Dinner) {
                (holder as ShowDinnerViewHolder)
                when(daynumber) {
                    1 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                }
                holder.dinnerBinding.executePendingBindings()
            }
        }

        override fun getItemCount(): Int {
            return 4
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
               else -> {
                    val dinnerBinding: DinnerBinding = DataBindingUtil.inflate(inflater, R.layout.dinner, parent, false)
                    return ShowDinnerViewHolder(dinnerBinding)
                }
            }
        }
    }
}