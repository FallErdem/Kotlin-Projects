package com.example.coffemachine

class Book constructor(var title: String = "Unknown", var author: String = "Anonymous", var yearPublished: Int = 2024){

    init {
        info()
    }
    
    fun info(){
        println("$title , $author")
    }
}