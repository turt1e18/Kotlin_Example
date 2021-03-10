package collection.set.mutablesSet

fun main(){
    val animals = mutableSetOf("Lion","Dog","Cat","Python","Hippo")
    println(animals)

    animals.add("Doog")
    println(animals)

    animals.remove("Python")
    println(animals)
}