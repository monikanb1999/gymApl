package com.example.gymapplication.ui.home

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.gymapplication.Handler
import com.example.gymapplication.databinding.FragmentHomeBinding
import com.example.gymapplication.db.CustomerDetails

class HomeFragment : Fragment(),Handler{

    private lateinit var homeViewModel: HomeViewModel
    lateinit var binding: FragmentHomeBinding

    //lateinit var dialogheightBinding: DialogheightBinding
   // private lateinit var adapter: GymRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val binding =FragmentHomeBinding.inflate(layoutInflater)
        return binding.root


//        adapter= GymRecyclerAdapter(this, this)
//        binding.gymrecyclerview?.setHasFixedSize(true)
//        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
//        binding.gymrecyclerview?.layoutManager = layoutManager
//        binding.gymrecyclerview?.adapter = adapter




    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeViewModel.gymdetaillist.observe(viewLifecycleOwner, Observer {
            Log.d("tyhty", "onViewCreated: ")
        })
    }

    override fun onAddClicked(view: View) {

        if (!TextUtils.isEmpty(binding.etheight.text.toString())) {
            val table = CustomerDetails(
                0, binding.etheight.text.toString(),
                binding.etweight.text.toString(),
                binding.ettargetweight.text.toString(),
                binding.etgender.text.toString(),
                binding.etdateofbirth.text.toString(),

            )
            homeViewModel.inserttable(table)
            Toast.makeText(context,"done the process",Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "not done process", Toast.LENGTH_LONG).show()
        }
    }
    }
//    class GymRecyclerAdapter(private val context: Context, val customerDetail: HomeFragment) : RecyclerView.Adapter<GymRecyclerAdapter.GymViewHolder>() {
//        private val inflater: LayoutInflater = LayoutInflater.from(context)
//        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GymViewHolder {
//            val binding: FragmentHomeBinding = DataBindingUtil.inflate(
//                inflater,
//                R.layout.fragment_home,
//                parent,
//                false
//            )
//            return GymViewHolder((binding))
//        }
//
//        override fun onBindViewHolder(holder: GymViewHolder, position: Int) {
//
//            holder.binding.setVariable(BR.data, gymdetaillist[position])
//            holder.binding.setVariable(BR.handler, customerDetail)
//            holder.binding.executePendingBindings()
//        }
//
//        override fun getItemCount(): Int {
//            return gymdetaillist.size
//        }
//
//        inner class GymViewHolder(val binding: FragmentHomeBinding) : RecyclerView.ViewHolder(binding.root)
//    }

//    override fun onAddClicked(view: View) {
//        if (!TextUtils.isEmpty(binding.etname.text.toString())) {
//            val table = CustomerDetails(
//                0, binding.etname.text.toString(),
//                binding.etage.text.toString().toInt(),
//                binding.etgender.text.toString(),
//                binding.etheight.text.toString(),
//                binding.etweight.text.toString()
//            )
//            HomeViewModel.inserttable(table)
//            Toast.makeText(this, "done!!!", Toast.LENGTH_LONG).show()
//        } else {
//            Toast.makeText(this, "done the process", Toast.LENGTH_LONG).show()
//        }
//    }
//
//    override fun onheightClicked(customerDetailsMainViewModel: HomeViewModel) {
//        TODO("Not yet implemented")
//    }
//}
//}