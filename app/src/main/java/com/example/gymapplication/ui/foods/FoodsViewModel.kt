package com.example.gymapplication.ui.foods

import android.app.Application
import androidx.lifecycle.*
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.db.GymDatabase
import com.example.gymapplication.db.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FoodsViewModel (application: Application): AndroidViewModel(application){

    private val tableRespository: Repository
    //observer for recyclerview
    var gymfooddetaillist: LiveData<CustomerDetails>
    init {
        val dao= GymDatabase.getInstance(getApplication()).GymDao()
        tableRespository= Repository(dao)
        gymfooddetaillist=tableRespository.getcustrepositorytable()
    }
    fun insertfoodtable(customerDetails: CustomerDetails)= viewModelScope.launch(Dispatchers.IO) {
        tableRespository.inserttablerepository(customerDetails)
    }
}