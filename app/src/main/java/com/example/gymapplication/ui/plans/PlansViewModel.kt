package com.example.gymapplication.ui.plans

import android.app.Application
import androidx.lifecycle.*
import com.example.gymapplication.db.CustomerDetails
import com.example.gymapplication.db.GymDatabase
import com.example.gymapplication.db.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PlansViewModel(application: Application): AndroidViewModel(application) {
    private val tableRespository: Repository

    //observer for recyclerview
    var gymplandetaillist: LiveData<CustomerDetails>

    init {
        val dao = GymDatabase.getInstance(getApplication()).GymDao()
        tableRespository = Repository(dao)
        gymplandetaillist = tableRespository.getcustrepositorytable()
    }

    fun inserttable(customerDetails: CustomerDetails) = viewModelScope.launch(Dispatchers.IO) {
        tableRespository.inserttablerepository(customerDetails)
    }
}