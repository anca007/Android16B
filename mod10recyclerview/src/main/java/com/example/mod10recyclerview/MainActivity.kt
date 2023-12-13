package com.example.mod10recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokemonList = arrayListOf(
            Pokemon("Pikachu", TypePokemon.ELECTRIQUE, 55, 4.5f),
            Pokemon("Bulbizarre", TypePokemon.PLANTE, 45, 4.3f),
            Pokemon("Salamèche", TypePokemon.FEU, 52, 4.2f),
            Pokemon("Carapuce", TypePokemon.EAU, 48, 4.4f),
            Pokemon("Dracaufeu", TypePokemon.DRAGON, 78, 4.6f),
            Pokemon("Ectoplasma", TypePokemon.SPECTRE, 65, 4.7f),
            Pokemon("Papilusion", TypePokemon.VOL, 60, 4.1f),
            Pokemon("Ronflex", TypePokemon.NORMAL, 110, 4.0f),
            Pokemon("Leviator", TypePokemon.EAU, 95, 4.8f),
            Pokemon("Electhor", TypePokemon.ELECTRIQUE, 83, 4.9f),
            Pokemon("Florizarre", TypePokemon.PLANTE, 82, 4.6f),
            Pokemon("Roucarnage", TypePokemon.VOL, 70, 4.2f),
            Pokemon("Arcanin", TypePokemon.FEU, 90, 4.5f),
            Pokemon("Nidoking", TypePokemon.POISON, 85, 4.4f),
            Pokemon("Arbok", TypePokemon.POISON, 60, 4.1f),
            Pokemon("Raichu", TypePokemon.ELECTRIQUE, 70, 4.3f),
            Pokemon("Aquali", TypePokemon.EAU, 65, 4.7f),
            Pokemon("Feunard", TypePokemon.FEU, 76, 4.4f),
            Pokemon("Ptera", TypePokemon.VOL, 80, 4.5f),
            Pokemon("Dracolosse", TypePokemon.DRAGON, 134, 4.8f)
        )

        val recycler = findViewById<RecyclerView>(R.id.pokemonRecycler)
        recycler.adapter = PokemonAdapter(pokemonList, {
            val intent = Intent(this, TargetActivity::class.java)
            intent.putExtra("name", it)
            startActivity(intent)
        })
        recycler.layoutManager = LinearLayoutManager(this)


    }
}