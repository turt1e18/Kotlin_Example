package collection.list.mutableList

fun main(){
    val mutableList1 : MutableList<String> = mutableListOf<String>("Kildong","Dooly","Chelsu")
    mutableList1.add("Hoit")
    println(mutableList1)
    mutableList1.removeAt(1)
    println(mutableList1)
    mutableList1[0] = "Sans"
    println(mutableList1)

    val mixMutableList1 = mutableListOf("Sans", ": Do you wanna a bad time?",1,'X')
    println(mixMutableList1)
}