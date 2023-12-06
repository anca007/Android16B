package com.example.mod3lib

import java.math.BigInteger
import java.util.Scanner

fun sissa(){

    val nbCases : Int = 63
    var grain  = 1
    var nbGrain : BigInteger = 2.toBigInteger()

    for (i in grain..nbCases){
        nbGrain = nbGrain.multiply(2.toBigInteger())
    }
    nbGrain--

    println("Nombre de grains = $nbGrain")

    println(Long.MAX_VALUE)
}

fun calculMoyenne(){
    val scan = Scanner(System.`in`)

    var somme : Float = 0.0f

    println("Entrez le nombre de notes :")
    val nbNotes = scan.nextInt()

    for (i in 0 until nbNotes){
        println("Entrez la valeur $i : ")
        val valeur = scan.nextFloat()
        somme += valeur
    }

    val moyenne = somme / nbNotes
    println("La moyenne est de $moyenne")

}

fun calculMoyennev2(){
    val STOP = -1f
    var note : Float = 0f
    var totalNote : Float = 0f
    var nbNotes = 0
    do{
        println("Note (-1 pour terminer)")
        note = readln().toFloat()

        if(note > STOP){
            totalNote += note
            nbNotes++
        }

    }while(note != STOP)

    println("La moyenne est de " + totalNote / nbNotes)
}

fun main() {
    sissa()
    calculMoyennev2()
}
