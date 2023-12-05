package com.example.mod3lib



//utilisation du if
//fun main() {
//    val age = 18
//
//    val message = if(age >= 18){
//        "majeur !"
//    }else{
//        "mineur !"
//    }
//
//    println(message)
//}

//utilisation du when
//fun main() {
//
//    val age = 45
//
//    when(age){
//        1,2 -> println("C'est un bébé !")
//        //3..18 déclare un ensemble de valeur
//        in 3..18 -> println("C'est un jeune !")
//        is Int -> println("C'est un vieux !")
//        else -> println("C'est autre chose")
//    }
//}
//

fun main() {
    //utilisation des boucles
    val pays = arrayOf("France", "Belgique", "Espagne")

    for(p in pays){
        println(p)
    }

    for ((idx, p) in pays.withIndex()){
        println("$idx = $p")
    }

    val autres = pays.filter { p ->
        p.contains("a")
    }

    println(autres)


}















