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
                    2->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst2a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst2b)
                    }
                    3->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst3a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst3b)
                    }
                    4->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst4a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst4b)
                    }
                    5->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst5a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst5b)
                    }
                    6->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst6a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst6b)
                    }
                    7->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst7a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst7b)
                    }
                    8->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst8a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst8b)
                    }
                    9->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst9a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst9b)
                    }
                    10->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst10a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst10b)
                    }
                    11->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst11a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst11b)
                    }
                    12->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst12a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst12b)
                    }
                    13->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst13a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst13b)
                    }
                    14->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst14a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst14b)
                    }
                    15->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst15a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst15b)
                    }
                    16->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst16a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst16b)
                    }
                    17->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst17a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst17b)
                    }
                    18->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst18a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst18b)
                    }
                    19->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst19a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst19b)
                    }
                    20->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst20a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst20b)
                    }
                    21->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst21a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst21b)
                    }
                    22->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst22a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst22b)
                    }
                    23->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst23a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst23b)
                    }
                    24->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst24a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst24b)
                    }
                    25->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst25a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst25b)
                    }
                    26->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst26a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst26b)
                    }
                    27->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst27a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst27b)
                    }
                    28->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst28a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst28b)
                    }
                    29->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst29a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst29b)
                    }
                    30->{
                        holder.rowitemBinding.textView.text.toString()
                        holder.rowitemBinding.rowCountTextView.text= resources.getString(R.string.brkfst30a)
                        holder.rowitemBinding.rowCountTextView2.text= resources.getString(R.string.brkfst30b)
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
                    2-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack2a)
                    }
                    3-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack3a)
                    }
                    4-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack4a)
                    }
                    5-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack5a)
                    }
                    6-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack6a)
                    }
                    7-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack7a)
                    }
                    8-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack8a)
                    }
                    9-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack9a)
                    }
                    10-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack10a)
                    }
                    11-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack11a)
                    }
                    12-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack12a)
                    }
                    13-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack13a)
                    }
                    14-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack14a)
                    }
                    15-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack15a)
                    }
                    16-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack16a)
                    }
                    17-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack17a)
                    }
                    18-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack18a)
                    }
                    19-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack19a)
                    }
                    20-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack20a)
                    }
                    21-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack21a
                        )
                    }
                    22-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack22a)
                    }
                    23-> {
                    holder.anotherrowitemBinding.snacktextView.text.toString()
                    holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack23a)
                     }
                    24-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack24a
                        )
                    }
                    25-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack25a)
                    }
                    26-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack26a)
                    }
                    27-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack27a)
                    }
                    28-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack28a)
                    }
                    29-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack29a)
                    }
                    30-> {
                        holder.anotherrowitemBinding.snacktextView.text.toString()
                        holder.anotherrowitemBinding.snackrowCountTextView.text= resources.getString(R.string.Snack30a)
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
                    2 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch2a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch2b)
                    }
                    3 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch3a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch3b)
                    }
                    4 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch4a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch4b)
                    }
                    5 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch5a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch5b)
                    }
                    6 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch6a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch6b)
                    }
                    7 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch7a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch7b)
                    }
                    8 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch8a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch8b)
                    }
                    9 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch9a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch9b)
                    }
                    10 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch10a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch10b)
                    }
                    11 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch11a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch11b)
                    }
                    12 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch12a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch12b)
                    }
                    13 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch13a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch13b)
                    }
                    14 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch14a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch14b)
                    }
                    15 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch15a
                        )
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch15b)
                    }
                    16-> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch16a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch16b)
                    }
                    17 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch17a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch17b)
                    }
                    18 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch18a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch18b)
                    }
                    19 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch19a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch19b)
                    }
                    20 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch20a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch20b)
                    }
                    21 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch21a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch21b)
                    }
                    22 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch22a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch22b)
                    }
                    23 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch23a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch23b)
                    }
                    24 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch24a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch24b)
                    }
                    25 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch25a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch25b)
                    }
                    26 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch26a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch26b
                        )
                    }
                    27 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch27a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch27b)
                    }
                    28 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch28a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch28b)
                    }
                    29 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch29a
                        )
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch29b)
                    }
                    30 -> {
                        holder.lunchBinding.lunchrowCountTextView.text= resources.getString(R.string.lunch30a)
                        holder.lunchBinding.lunchtextView.text.toString()
                        holder.lunchBinding.lunchrowCountTextView2.text= resources.getString(R.string.lunch30b)
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
                    2 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner2a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner2b)
                    }
                    3 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner3a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner3b)
                    }
                    4 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner4a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner4b)
                    }
                    5 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner5a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner5b)
                    }  6 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner6a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner6b)
                }  7 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner7a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner7b)
                }  8 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner8a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner8b)
                }
                    9 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner9a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner9b)
                    }  10 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner10a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner10b)
                }
                    11 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner11a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner11b)
                    }
                    12 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner12a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner12b)
                    }
                    13 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner13a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner13b)
                    }  14 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner14a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner14b)
                }  15 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner15a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner15b)
                }
                    16-> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner16a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner16b)
                    }
                    17 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner17a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner17b)
                }
                    18-> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner18a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner18b)
                    }
                    19 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner19a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner19b)
                }
                    20 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner20a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner20b)
                }
                    21 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner21a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner21b)
                    }
                    22 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner22a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner22b)
                }
                    23 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner23a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner23b)
                    }
                    24 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner24a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner24b)
                }
                    25 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner25a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner25b)
                    }
                    26 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner26a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner26b)
                    }
                    27 -> {
                        holder.dinnerBinding.dinnertextView.text.toString()
                        holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner27a)
                        holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner27b)
                    }
                    28 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner28a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner28b)
                }  29 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner29a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner29b)
                }
                    30 -> {
                    holder.dinnerBinding.dinnertextView.text.toString()
                    holder.dinnerBinding.dinnerrowCountTextView.text= resources.getString(R.string.Dinner30a)
                    holder.dinnerBinding.dinnerrowCountTextView2.text= resources.getString(R.string.Dinner30b)
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