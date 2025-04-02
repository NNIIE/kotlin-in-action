package com.kotlin

/*
* 람다: 다른 함수에 넘길 수 있는 작은 코드 조각, 함수를 일급 시민으로 편하게 다룰 수 있게 해줌
* 람다는 메서드가 하나뿐인 익명 객체 대신 사용할 수 있다.
* 코틀린에선 람다 안에서 람다 밖 함수에 있는 final 이 아닌 변수에 접근 가능하다.
* 함수형 인터페이스: 단 하나의 추상메서드만을 가지고 비추상 메서드는 여럿 가질 수 있다.
* 수신 객체 지정 람다: 수신 객체를 명시하지 않고 람다의 본문 안에서 다른 객체의 메서드를 호출할 수 있음
 */

/*
* apply() 함수를 사용하면 Builder 패턴을 사용하지 않고도 객체를 생성할 수 있나?
* buildList, buildSet, buildMap 은 진짜 편하겠다.
 */

fun main() {
    val people = listOf(Person1("Greg", 20), Person1("Gave", 30))
    val maxPerson = people.maxByOrNull(Person1::age)
    val sum = { x: Int, y: Int -> x + y }
    val createPerson = ::Person1
    val people1 = createPerson("Greg", 20)
    println(buildListTest())
}

data class Person1(val name: String, val age: Int)

fun alphabetWith() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun buildListTest() = buildList {
    addAll(listOf(1, 2, 3))
    add(4)
    add(index = 0, element = 0)
}