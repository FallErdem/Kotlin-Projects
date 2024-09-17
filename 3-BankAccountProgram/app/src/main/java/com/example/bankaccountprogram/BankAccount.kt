package com.example.bankaccountprogram

class BankAccount(var accountHolder: String, var balance: Double) {

    private val transactionHistory = mutableListOf<String>()


    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $amount dollars.")
    }

    fun withdraw(amount: Double){
        if(amount <= balance){
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount .")
        }else{
            println("You don't have enough money to withdraw.")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }
}