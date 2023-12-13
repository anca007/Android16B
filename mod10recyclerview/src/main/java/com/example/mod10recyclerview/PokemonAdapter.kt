package com.example.mod10recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10recyclerview.databinding.TemplatePokemonLineBinding

class PokemonAdapter(val pokemonList: List<Pokemon>, val listener : (name : String) -> Unit) : Adapter<PokemonAdapter.PokemonVH>() {
    class PokemonVH(val binding: TemplatePokemonLineBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonVH {
        val binding = TemplatePokemonLineBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PokemonVH(binding)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: PokemonVH, position: Int) {
        holder.binding.pokemon = pokemonList[position]
        holder.itemView.setOnClickListener {
           listener.invoke(pokemonList[position].name)
        }
    }
}