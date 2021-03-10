package collection.set.immutablesSet

fun main(){ //set
    val mixedTypeSet1 = setOf("Hello",5,"World",3.14,'c')
    var inSet1 : Set<Int> = setOf<Int>(1,5,5)

    println(mixedTypeSet1)
    println(inSet1)
}