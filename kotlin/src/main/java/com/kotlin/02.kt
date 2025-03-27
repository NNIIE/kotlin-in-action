package com.kotlin

fun main1() {
    println("Hello, World!")
}

fun max(a: Int, b: Int) = if (a > b) "a" else b

fun main2() {
    val name = readln()
    println("Hello, ${if (name.isBlank()) "someone" else name}!")
}

