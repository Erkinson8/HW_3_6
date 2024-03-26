package com.example.hw_3_6
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(private val cities: List<City>) : RecyclerView.Adapter<CityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false)
        return CityViewHolder(view)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val city = cities[position]
        holder.cityNameTextView.text = city.name
        holder.countryNameTextView.text = city.country
    }

    override fun getItemCount(): Int {
        return cities.size
    }
}



class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val cityNameTextView: TextView = itemView.findViewById(R.id.textViewCityName)
    val countryNameTextView: TextView = itemView.findViewById(R.id.textViewCountryName)
}
