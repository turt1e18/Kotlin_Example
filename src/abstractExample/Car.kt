package abstractExample

class Car(name : String, color : String, weight : Double, override var maxSpeed : Double) : Vehicle(name, color, weight) {
    override fun start(){
        println("Car Started")
    }
    override fun stop() {
        println("Car Stopped")
    }
}

class Motorcycle(name: String,color: String,weight: Double,override var maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("Bike Started")
    }

    override fun stop() {
        println("Bike Stopped")
    }
}