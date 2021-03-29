package com.example.gymapplication

import android.view.View
import com.example.gymapplication.ui.home.HomeViewModel

interface Handler {
   fun onAddClicked(view: View)
}

interface LogHandler
{
    fun onSaveClicked(view: View)
//    fun onResetClicked(view: View)
}
interface HomeDetails
{
    fun onDoneClicked(view: View)
}