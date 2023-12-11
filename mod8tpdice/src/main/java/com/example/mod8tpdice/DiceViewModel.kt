package com.example.mod8tpdice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {

    var nbDice = MutableLiveData<Int>(0)
    var imageId = R.drawable.d1
    var totalLeft = 0
    var nbLaunchLeft = 0
    var totalRight = 0
    var nbLaunchRight = 0

    fun launchLeft(){
        nbLaunchLeft++
        totalLeft += launchRandom()
    }

    fun launchRight(){
        nbLaunchRight++
        totalRight += launchRandom()
    }

    fun launchRandom() : Int{
        val dice = (1..6).random()
        nbDice.value = dice

        imageId = when(dice){
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            6 -> R.drawable.d6
            else -> R.drawable.d6
        }

        return dice
    }


}