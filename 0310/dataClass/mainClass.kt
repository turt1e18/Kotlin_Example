package dataClass

fun main(){ //데이타아 클래스 연습
    val cus1 = Customer("Seam","sean@mail.com")
    val cus2 = Customer("Seam","sean@mail.com")

    println(cus1 == cus2) //동위성 검증
    println(cus1.equals(cus2))
    println("${cus1.hashCode()},${cus2.hashCode()}") //해쉬값 동일 검증

    val cus3 = cus1.copy(name="Alice") // copy 함수 데이터를 복사하되 다른 프로퍼티값을 가지는 것만 명시
    println(cus1.toString())
    println(cus3.toString())
}