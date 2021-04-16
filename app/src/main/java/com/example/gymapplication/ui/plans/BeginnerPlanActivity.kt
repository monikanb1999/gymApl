package com.example.gymapplication.ui.plans

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gymapplication.R
import com.example.gymapplication.databinding.*
import com.example.gymapplication.ui.Activity.FoodListActivity
import com.example.gymapplication.ui.Activity.PlanlistActivity

class BeginnerPlanActivity : AppCompatActivity() {
    lateinit var binding: ActivityBeginnerPlanBinding
    private lateinit var adapter: PlanRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBeginnerPlanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = PlanRecyclerAdapter(this,this)
        binding.planrecyclerview?.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.planrecyclerview?.layoutManager = layoutManager
        binding.planrecyclerview?.adapter = adapter
    }

class PlanRecyclerAdapter(val context: Context?, private val beginnerPlanBinding: BeginnerPlanActivity) : RecyclerView.Adapter<PlanRecyclerAdapter.PlanViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanViewHolder {
        val beginnerPlanBinding: BeginnerplanrecordBinding = DataBindingUtil.inflate(inflater, R.layout.beginnerplanrecord, parent, false)
        return PlanViewHolder((beginnerPlanBinding))
    }

    override fun onBindViewHolder(holder: PlanViewHolder, position: Int) {
        holder.binding.plantext.text = "DAY" + "-" + (position + 1)
//            holder.binding.setVariable(BR.foodhandler,foodsFragment)
        holder.binding.recyclerplan.setOnClickListener{
//                Toast.makeText(context, "thifdj$position",Toast.LENGTH_LONG).show()
            val intent= Intent(context, PlanlistActivity::class.java)
            intent.putExtra("position",position + 1)
            context!!.startActivity(intent)
        }
        holder.binding.executePendingBindings()
    }


    override fun getItemCount(): Int {
        return 30
    }

    inner class PlanViewHolder(val binding: BeginnerplanrecordBinding) : RecyclerView.ViewHolder(binding.root)

}

}
