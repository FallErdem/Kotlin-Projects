package com.example.coffemachine

import java.time.temporal.TemporalAmount

data class CoffeeDetails(
    val sugarCount:Int,
    val name:String,
    val size:String,
    val creamAmount:Int )
{

}


fun main(){

    val coffeeForErdem = CoffeeDetails(3, "Erdem", "M", 1)
    makeCoffee(coffeeForErdem)

}

fun askCoffeeDetails(){

    println("Who is this coffee for?")
    val name = readln()

    println("How many sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
   // makeCoffee(sugarCountInt, name)

}

fun makeCoffee(coffeeDetails: CoffeeDetails){
    if(coffeeDetails.sugarCount == 1){
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} " +
                "cream: ${coffeeDetails.creamAmount}")
    }else if(coffeeDetails.sugarCount > 1 ){
        println("Coffe with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} " +
                "cream: ${coffeeDetails.creamAmount}")
    }else if(coffeeDetails.sugarCount == 0){
        println("Coffe with no sugar for ${coffeeDetails.name} cream: ${coffeeDetails.creamAmount}")
    }else{
        println("Wrong choice try again!")
    }
}