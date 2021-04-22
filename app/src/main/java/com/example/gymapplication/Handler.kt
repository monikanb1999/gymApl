package com.example.gymapplication

import android.view.View
import com.example.gymapplication.ui.home.HomeViewModel

interface Handler {
   fun onAddClicked(view: View)
   fun onGalleryClicked(view: View)
   fun onCameraClicked(view: View)
   fun onOpenCamClicked(view: View)

}
interface signuphandler
{
    fun onsignupclicked(view: View)
}
interface BeginHandler
{
    fun onBeginnerClicked(view: View)
    fun onIntermediateClicked(view: View)
    fun onAdvancedClicked(view: View)
}
interface RegisterHandler{
    fun onRegisterSavedClicked(view: View)
    fun onRegRadiomaleButtonClicked(view: View)
    fun onRegRadiofemaleButtonClicked(view: View)
    fun onRegRadiootherButtonClicked(view: View)
}
interface LogHandler
{
    fun onSaveClicked(view: View)
    fun onSignUpClicked(view: View)
}
interface HomeDetails
{
    fun onDoneClicked(view: View)
    fun onRadioButtonClicked(view: View)
    fun onRadiofemaleButtonClicked(view: View)
    fun onRadiomaleButtonClicked(view: View)
    fun onRadiootherButtonClicked(view:View)
}

interface FoodDetails

{
    fun onFoodClick(daynumber:Int)
    fun onFoodDetailsClicked(view: View)

}