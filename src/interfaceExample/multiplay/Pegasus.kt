package interfaceExample.multiplay

class Pegasus: Bird,Horse { // 다중상속
    override val wings: Int = 2
    override val maxSpeed: Int = 100
    override fun run() {
        println("Run!")
    }

    override fun fly() {
        println("Fly!")
    }

    override fun jump() {
        super<Horse>.jump()
        println("Pegasus Jump!")
    }
}