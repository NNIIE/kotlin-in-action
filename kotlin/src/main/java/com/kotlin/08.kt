package com.kotlin

/*
* 코틀린은 원시타입과 참조타입을 구분하지 않고 실행시점에 가능한 가장 효율적인 방식으로 표현된다.
* 대부분 자바의 원시타입으로 컴파일 되고 컬렉션같은 제네릭 클래스를 사용할때는 참조타입으로 컴파일된다.
* 부호없는 원시타입을 지원한다. (양수로 대략 40억까지 지원하는 UInt)
* 코틀린의 널이될 수 있는 타입은 자바의 래퍼타입으로 컴파일된다.
* 코틀린은 타입의 자동변환을 지원하지 않는다.
* Any: 널이 될 수 없는 타입의 최상위 타입, 자바의 Object 로 컴파일된다.
* Unit: 제네릭 함수를 오버라이드 하지 않는다면 자바의 void 로 컴파일된다.
* Nothing: 절대 반환하지 않는 타입, 예외를 던지거나 무한루프를 돌거나 하는 경우
* List<Int?>: 리스트의 요소가 널이 될 수 있는 타입
* List<Int>?: 리스트 자체가 널이 될 수 있는 타입
* List<Int?>?: 리스트 자체와 요소가 모두 널이 될 수 있는 타입
* 코틀린에선 컬렉션 안의 데이터에 접근하는 인터페이스와 컬렉션 안의 데이터를 변경하는 인터페이스가 분리되어 있다.
*  * 가능한 한 읽기 전용 인터페이스을 사용하고, 변경이 필요한 경우에만 변경 인터페이스를 사용한다.
*  * 코틀린의 읽기전용 컬렉션을 자바 메서드에 넘겨도 자바는 이를 읽기전용으로 인식하지 않는다.
 */


/*
* listOf, mutableListOf가 인상적이다.
 */

fun main() {
    val answer: Any = 42
    val immutableList = listOf(1, 2, 3, null)
    val mutableList = mutableListOf(1, 2, 3, null)
    val notNullList = immutableList.filterNotNull()
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}