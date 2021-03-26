package com.example.gymapplication.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface GymDao {
    @Insert
    fun insertcustomerdetails(customerDetails: CustomerDetails)//1

    @Query("select * from customerdetails")
    fun getcustomerdetails(): LiveData<CustomerDetails>//2

//    @Update
//    fun updatetable(customerDetails: CustomerDetails)

}