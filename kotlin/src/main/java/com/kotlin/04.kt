package com.kotlin

/*
* 모든 클래스와 메서드는 기본적으로 final 이며 public 이다.
  * open 키워드로 열어야 한다.
* internal: 같은 모듈에서만 참조 가능
* sealed: 컴파일 시점에 모든 하위 클래스를 알 수 있는 추상클래스
* 생성자 파라미터 또한 기본값을 정의할 수 있다.
* 클래스 생성자/프로퍼티 접근자를 컴파일가 자동으로 생성해준다.
* constructor: 부 생성자
* 객체 동등성 비교: == (!=) , 참조 동일성 비교: === (!==)
* is: 타입 검사 (instanceof)
* data class: equals(), hashCode(), toString(), copy() 자동 생성
* object: 클래스를 정의하는 동시에 인스턴스 생성
*  * 싱글톤
*  * companion object: 동반 객체
*    * 정적 팩토리 메서드에 유용해 보임
*  * 객체 식
* 인라인 클래스(@JvmInline): 타입 안정성
* 코틀린은 static 키워드를 지원하지 않는다.
 */

fun main() {
    val user = User("Greg", 20)
    user.age = 30
    println(user.age)
}

class User(
    name: String,
    age: Int
) {
    var age: Int = age
        set(value) {
            if (value < 0) {
                throw IllegalArgumentException("Age must be non-negative")
            }
            field = value
        }
}

object Payroll {
    val allEmployees = arrayListOf<User>()

    fun calculateSalary() {
        // ...
    }
}

enum class Status { SUCCESS, ERROR, LOADING }
data class ApiResponse<T> private constructor(
    val status: Status,
    val data: T?,
    val message: String
) {
    companion object {
        fun <T> success(data: T): ApiResponse<T> = ApiResponse(Status.SUCCESS, data, "")
        fun <T> error(msg: String, data: T?): ApiResponse<T> = ApiResponse(Status.ERROR, data, msg)
        fun <T> loading(data: T?): ApiResponse<T> = ApiResponse(Status.LOADING, data, "")
    }
}
