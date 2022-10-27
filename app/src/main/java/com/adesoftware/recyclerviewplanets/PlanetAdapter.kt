package com.adesoftware.recyclerviewplanets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlanetAdapter(
    var planetModel: ArrayList<PlanetModel>

): RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_list, parent, false)
        return PlanetViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.itemView.apply {
            holder.bind(planetModel[position])
        }
        holder.textViewName.text = planetModel.get(position).name
        holder.imageView.setImageResource(planetModel.get(position).planetImage)
    }

    override fun getItemCount(): Int = planetModel.size

    class PlanetViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var textViewName: TextView
        var textViewDescription: TextView

        init {
            imageView = itemView.findViewById(R.id.iv_planets)
            textViewName = itemView.findViewById(R.id.tv_planets)
            textViewDescription = itemView.findViewById(R.id.tv_description)
        }

        fun bind(planetModel: PlanetModel) {
            imageView.setImageResource(planetModel.planetImage)
            textViewName.text = planetModel.name
            textViewDescription.text = planetModel.description
        }
    }

}