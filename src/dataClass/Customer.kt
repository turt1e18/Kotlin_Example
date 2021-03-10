package dataClass

data class Customer(var name: String, var email: String){
    var job : String = "Unknown"
    constructor(name: String,email: String,_job:String):this (name,email){
        job=_job
    }
    init {
        println("Hello World!!")
    }
}
