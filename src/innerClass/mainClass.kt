package innerClass

fun main(){ //이너클래스
    val output = Outer.Nested().greeting()
    println(output)

    val outer = Outer()
    outer.outside()
}