package interfaceExample.delegate

fun main(){
    val person = Person(StaffName(),Work())
    println(person.name)
    person.run()
}