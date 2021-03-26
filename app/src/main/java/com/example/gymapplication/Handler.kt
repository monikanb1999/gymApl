package com.example.gymapplication

import android.view.View
import com.example.gymapplication.ui.home.HomeViewModel

interface Handler {
    fun onAddClicked(view: View)
    //fun onheightClicked(customerDetailsMainViewModel: HomeViewModel)
}

interface DialogHtHandler
{
    fun onBtnhtClicked(view: View)
}