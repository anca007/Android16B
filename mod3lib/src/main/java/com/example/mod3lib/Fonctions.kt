package com.example.mod3lib

//focntion d'extension
//fun main() {
//
//    fun String.sayHello(){
//        println("Salut $this")
//    }
//
//    "Michel".sayHello()
//}

//opérateur elvis
//fun main() {
//
//    var name : String? = null
//
//    //val taille = name?.length
//    //val taille = name!!.length
//    val taille = name?.length?:0
//
//    if(name != null){
//        name.length
//    }
//    println(taille)
//}

//prédicat
fun main() {

    //liste modifiable
    val colors = mutableListOf<String>("blue", "yellow", "purple")
    //liste non modifiable
    val colors2 = listOf<String>("black", "white", "grey")

    //modifie la liste existante
    colors.add("pink")
    //renvoie une nouvelle liste avec les éléments
    colors2.plus("test")

    colors += "blue"
    colors += "cornflowerblue"

    //it paramètre par défaut sinon nomDuParam ->
    colors.filter { color -> color.length > 5 }.forEach { println(it) }

}