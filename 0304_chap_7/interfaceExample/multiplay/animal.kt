package interfaceExample.multiplay

interface Bird {
    val wings : Int
    fun fly()
    fun jump(){
        println("bird jump!")
    }
}

interface Horse {
    val maxSpeed: Int
    fun run()
    fun jump(){
        println("jump!, max speed: $maxSpeed")
    }
}