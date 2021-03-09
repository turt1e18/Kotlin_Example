package innerClass

class Outer {
    val ov = 5
    class Nested{
        val nv = 10
        fun greeting() = "[Nested]Hello! $nv"
    }
    fun outside() {
        val msg = Nested().greeting()
        println("[Outer]: $msg, ${Nested().nv}")
    }
}