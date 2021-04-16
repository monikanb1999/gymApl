package com.example.gymapplication.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.db.GymDatabase
import com.example.gymapplication.db.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EditableViewModel(application: Application): AndroidViewModel(application) {
    private val tableRespository: Repository
    //observer for recyclerview
    var editablegymdetaillist: LiveData<CustomerDetails>
    init {
        val dao= GymDatabase.getInstance(getApplication()).GymDao()
        tableRespository= Repository(dao)
        editablegymdetaillist=tableRespository.getcustrepositorytable()
    }

    fun updatetable(customerDetails: CustomerDetails)= viewModelScope.launch(Dispatchers.IO) {
        tableRespository.updatetablerepository(customerDetails)
    }
}