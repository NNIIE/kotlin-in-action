package com.kotlin

/*
* 관례: 어떤 언어 기능과 미리 정해진 이름의 함수를 연결해 주는 기법
* 함수를 통해 구현해도 연산자 우선쉰위는 언제나 표준 숫자 타입에 대한 연산자 우선순위와 같다.
* 
 */


/*
*
 */

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2) // Point(x=40, y=60)
}