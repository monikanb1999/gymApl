package com.example.gymapplication.ui.Activity

import androidx.recyclerview.widget.RecyclerView
import com.example.gymapplication.databinding.AnotherrowitemBinding
import com.example.gymapplication.databinding.DinnerBinding
import com.example.gymapplication.databinding.LunchBinding
import com.example.gymapplication.databinding.RowitemBinding

 class ShowBreakFastViewHolder(val rowitemBinding: RowitemBinding) : RecyclerView.ViewHolder(rowitemBinding.root)
 class ShowSnacksViewHolder(val anotherrowitemBinding: AnotherrowitemBinding) : RecyclerView.ViewHolder(anotherrowitemBinding.root)
 class ShowLunchViewHolder(val lunchBinding: LunchBinding) : RecyclerView.ViewHolder(lunchBinding.root)
 class ShowDinnerViewHolder(val dinnerBinding: DinnerBinding) : RecyclerView.ViewHolder(dinnerBinding.root)