package abstractExample

abstract class Vehicle(val name:String, val color:String, val weight: Double) {
    abstract var maxSpeed:Double
    var year = 2014
    abstract fun start()
    abstract fun stop()

    fun displaySpecs(){
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}