package collection.list.imMutableList.listOfNotNull

fun main(){
    val noneNullList1 : List<Int> = listOfNotNull(2, 45, 2, null, 5, null)

    println(noneNullList1)
}