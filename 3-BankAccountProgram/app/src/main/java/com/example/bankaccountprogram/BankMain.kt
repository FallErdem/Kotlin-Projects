package com.example.bankaccountprogram

fun main(){

    val erdemsBankAccount = BankAccount("Erdem",1500.5)

    erdemsBankAccount.deposit(200.0)
    erdemsBankAccount.withdraw(1500.0)
    erdemsBankAccount.displayTransactionHistory()
    println("Total balance is: ${erdemsBankAccount.balance}")
}