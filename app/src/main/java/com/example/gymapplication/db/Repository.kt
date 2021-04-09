package com.example.gymapplication.db

import androidx.lifecycle.LiveData

class Repository(private val gymDao: GymDao) {
    fun getcustrepositorytable(): LiveData<CustomerDetails>
    {
        return gymDao.getcustomerdetails()//2
    }
    fun inserttablerepository(customerDetails: CustomerDetails){
        return gymDao.insertcustomerdetails(customerDetails)//1
    }
    fun updatetablerepository(customerDetails: CustomerDetails) {
        return gymDao.updatecustomerdetails(customerDetails)
    }
}
//    fun updatetablerepository(customerDetails: CustomerDetails){
//        return gymDao.updatetable(customerDetails)
//    }
