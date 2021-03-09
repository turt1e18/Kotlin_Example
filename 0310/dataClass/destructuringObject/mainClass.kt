package dataClass.destructuringObject

import dataClass.Customer

fun main(){
    val cus1 = Customer("Seam","sean@mail.com")

    val(name, email) = cus1 //디스트럭처링 -> 객체가 가지고 있는 프로퍼티를 개별 변수로 분해하여 할당하는 것
    println("name = $name, email = $email")
}