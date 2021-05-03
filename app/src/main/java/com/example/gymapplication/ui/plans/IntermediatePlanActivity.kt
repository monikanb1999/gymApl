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
import com.example.gymapplication.databinding.ActivityIntermediatePlanBinding
import com.example.gymapplication.databinding.IntermediateplanrecordBinding
import com.example.gymapplication.ui.Activity.IntermediateplanListActivity

class IntermediatePlanActivity : AppCompatActivity() {
    lateinit var binding: ActivityIntermediatePlanBinding
    private lateinit var interadapter: IntermediatePlanRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityIntermediatePlanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        interadapter =IntermediatePlanRecyclerAdapter(this, this)
        binding.interrecyclerview?.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.interrecyclerview?.layoutManager = layoutManager
        binding.interrecyclerview?.adapter = interadapter
    }

    class IntermediatePlanRecyclerAdapter(val context: Context?, private val intermediatePlanBinding: IntermediatePlanActivity) : RecyclerView.Adapter<IntermediatePlanRecyclerAdapter.IntermediateViewHolder>() {
        private val inflater: LayoutInflater = LayoutInflater.from(context)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntermediateViewHolder {
            val intermediatePlanBinding: IntermediateplanrecordBinding = DataBindingUtil.inflate(inflater, R.layout.intermediateplanrecord, parent, false)
            return IntermediateViewHolder((intermediatePlanBinding))
        }

        override fun getItemCount(): Int {
            return 30
        }
        inner class IntermediateViewHolder(val binding: IntermediateplanrecordBinding) : RecyclerView.ViewHolder(binding.root)

        override fun onBindViewHolder(holder: IntermediateViewHolder, position: Int) {
            holder.binding.interplantext.text="DAY" + "-" + (position + 1)
              holder.binding.interrecyclerplan.setOnClickListener {
                  val intent =Intent(context,IntermediateplanListActivity::class.java)
                  intent.putExtra("position",position+1)
                  context!!.startActivity(intent)
              }
            holder.binding.executePendingBindings()
        }

    }
}