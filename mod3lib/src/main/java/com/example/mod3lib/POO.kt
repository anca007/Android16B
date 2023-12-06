package com.example.mod3lib

class Basique

open class Personne(private val firstname: String) {
    fun sayHello(){
        println("Hello !")
    }
}

class Enfant(var name : String) : Personne(name){

}

data class Cahier(
    private val nbPages: Int,
    private val marque : String
)

fun main() {
    val b = Basique()
    val p = Personne("Michel")
    p.sayHello()

    val e = Enfant("Michel Junior")
    e.sayHello()

    val c = Cahier(52, "Oxford")
    println(c)
}








