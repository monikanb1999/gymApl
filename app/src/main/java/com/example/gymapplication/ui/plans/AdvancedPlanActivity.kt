package com.example.gymapplication.ui.plans

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gymapplication.R
import com.example.gymapplication.databinding.ActivityAdvancedPlanBinding
import com.example.gymapplication.databinding.AdvanceplanrecordBinding
import com.example.gymapplication.ui.Activity.PlanlistActivity

class AdvancedPlanActivity : AppCompatActivity() {
    lateinit var binding: ActivityAdvancedPlanBinding
    private lateinit var advadapter: AdvPlanRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAdvancedPlanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        advadapter = AdvPlanRecyclerAdapter(this, this)
        binding.advrecyclerview?.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.advrecyclerview?.layoutManager = layoutManager
        binding.advrecyclerview?.adapter = advadapter
    }

    class AdvPlanRecyclerAdapter(val context: Context?, private val advancedPlanBinding: AdvancedPlanActivity) : RecyclerView.Adapter<AdvPlanRecyclerAdapter.PlanViewHolder>() {

        private val inflater: LayoutInflater = LayoutInflater.from(context)
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanViewHolder {
            val advanceplanrecordBinding :AdvanceplanrecordBinding= DataBindingUtil.inflate(inflater, R.layout.advanceplanrecord, parent, false)
            return PlanViewHolder((advanceplanrecordBinding))
        }

        override fun onBindViewHolder(holder: PlanViewHolder, position: Int) {
            holder.binding.advplantext.text = "DAY" + "-" + (position + 1)
//            holder.binding.setVariable(BR.foodhandler,foodsFragment)
            holder.binding.advrecyclerplan.setOnClickListener{
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

        inner class PlanViewHolder(val binding: AdvanceplanrecordBinding) : RecyclerView.ViewHolder(binding.root)

    }
}