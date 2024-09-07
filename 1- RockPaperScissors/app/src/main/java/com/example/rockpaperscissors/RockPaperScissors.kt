package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""

    println("Choose your weapon: Rock, Paper, Scissors")
    playerChoice = readln()

    val randomNumber = (1..3).random()
    if(randomNumber == 1){
        computerChoice = "Rock"
    }else if(randomNumber == 2){
        computerChoice = "Paper"
    }else if(randomNumber == 3){
        computerChoice = "Scissors"
    }
    println("Computers Choice was the " + computerChoice)

    val winner = when{
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("Tie!")
    }else{
        println("$winner won the match")
    }

}