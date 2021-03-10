package interfaceExample.pet

class Cat(override var category : String) : Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}