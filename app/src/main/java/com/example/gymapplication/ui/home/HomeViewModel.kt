package com.example.gymapplication.ui.home

import android.app.Application
import androidx.lifecycle.*
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.db.GymDatabase
import com.example.gymapplication.db.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel (application: Application): AndroidViewModel(application) {
    private val tableRespository: Repository
    //observer for recyclerview
        var gymdetaillist: LiveData<CustomerDetails>
    init {
        val dao= GymDatabase.getInstance(getApplication()).GymDao()
        tableRespository= Repository(dao)
        gymdetaillist=tableRespository.getcustrepositorytable()
    }
    fun inserttable(customerDetails: CustomerDetails)= viewModelScope.launch(Dispatchers.IO) {
        tableRespository.inserttablerepository(customerDetails)
    }
//    fun updatetable(customerDetails: CustomerDetails)= viewModelScope.launch(Dispatchers.IO) {
//        tableRespository.updatetablerepository(customerDetails)
//    }
}