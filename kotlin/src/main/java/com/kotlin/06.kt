package com.kotlin

/*
* 람다를 더 편하게 사용하기 위한 여러 함수들을 설명한다.
* 시퀀스: 자바 8의 스트림과 비슷하게 중간 임시 컬렉션을 사용하지 않고 컬렉션 연산을 연쇄함.
*  * 자바와 달리 코틀린은 람다가 기본적으로 지연연산을 수행하지 않는다.
 */


/*
* zip 함수는 처음보고 좋아보이지만 언제 써볼 수 있을지는 모르겠다.
 */

data class Person2(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person2("Greg", 20),
        Person2("Gave", 30),
        Person2("Richard", 40)
    )

    // asSequence: 중간 결과를 저장하는 컬렉션이 생기지 않음
    people
        .asSequence()
        .map(Person2::age)
        .filter { it > 20 }
        .toList()
}