package interfaceExample.pet

fun main(){ // 인터페이스 클래스 연습
    val obj = Cat("samll")
    println("Pet Category: ${obj.category}")
    obj.feeding()
    obj.patting()
}