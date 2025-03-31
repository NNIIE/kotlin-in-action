package com.kotlin

import com.kotlin.Color.*
import java.io.BufferedReader

/**
 * null 가능성을 명시적으로 구분한다.
 * 여러 클래스를 같은파일에 작성 가능하고 파일의 최상단에 함수를 작성할 수 있다.
 * if는 식이다.
 * 스마트 캐스트: 변수를 한번 타입검사를 하면 굳이 캐스팅하지 않아도 된다.
 * checked / unchecked를 구별하지 않는다.
 */

fun main1() {
    println("Hello, World!")

    val person = Person("Greg", true)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun main2() {
    val name = readln()
    println("Hello, ${if (name.isBlank()) "someone" else name}!")
}

class Person(
    val name: String,
    var isStudent: Boolean
)

class Rectangle(
    val height: Int,
    val width: Int
) {
    val isSquare: Boolean = (height == width)
}

enum class Color(
    val r: Int,
    val g: Int,
    val b: Int
) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0),
    CYAN(0, 255, 255),
    MAGENTA(255, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
    fun printColor() = println("%this is ${rgb()}")
}

fun getWarmThFromSensor() =
    when (Color.RED) {
        RED -> "Richard"
        GREEN -> "Gave"
        BLUE -> TODO()
        YELLOW -> TODO()
        CYAN -> TODO()
        MAGENTA -> TODO()
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> RED
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, CYAN) -> BLUE
        setOf(CYAN, MAGENTA) -> CYAN
        setOf(MAGENTA, RED) -> MAGENTA
        else -> throw Exception("Dirty color")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval (e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw Exception("Unknown expression")
    }

fun iterator() {
    for (i in 1..5) {
        println(i)
    }

    for (i in 100 downTo 1 step 2) {
        println(i)
    }
}

fun main3() {
    val collection = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (color in collection) {
        println(color)
    }
}

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
}

























