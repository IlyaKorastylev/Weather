package com.example.weather

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ForecastViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val sourceName: TextView = itemView.findViewById(R.id.day)

    fun bind(model: Forecasts) {
        sourceName.text = model.dayOfWeek
    }

}
