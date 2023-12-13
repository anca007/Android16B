package com.example.mod10recyclerview

enum class TypePokemon{
    NORMAL, ELECTRIQUE, EAU, FEU, PLANTE, POISON, VOL, DRAGON, SPECTRE
}
data class Pokemon(
    val name : String,
    val type : TypePokemon,
    val pa : Int,
    val rating : Float
)
