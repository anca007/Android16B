package com.example.mod3lib

//var test = "Hello"
//fun main(){
//    println(test)
//}


//test de la différence entre val et var
//fun main(){
//    val value: Int = 10
//    //value = 50 // pas possible
//
//    var value2 = 50
//    value2 = 100
//    //value2 = "Bonjour" //pas possible
//}

//lazy

fun main() {
    var mot = "World !"

    val message by lazy { "Hello $mot" }

    //println(message)

    mot = "Man !"

    println(message)
}


















