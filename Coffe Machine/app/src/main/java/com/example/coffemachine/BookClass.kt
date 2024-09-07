package com.example.coffemachine

fun main(){
    var bookInfo = Book("Harry Potter", "Erdem", 2001)
    println("The name of the book is ${bookInfo.title}" + "made in ${bookInfo.yearPublished}")
}