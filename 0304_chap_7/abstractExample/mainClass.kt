package abstractExample

fun main(){ // 추상클래스 연습
    val car = Car("SuperMatiz","yellow", 1110.0,270.0)
    val motor = Motorcycle("DreamBike","red", 173.0,100.0)

    car.year = 2016

    car.displaySpecs()
    car.start()

    motor.displaySpecs()
    motor.start()

}