package collection.list.imMutableList

class ImmutableList {
    var numbers: List<Int> = listOf(1,2,3,4,5)
    var names: List<String> = listOf("one","two","three")

    fun playName(){
        for(name in names)
            println(name)
    }

    fun playNumber(){
        for(num in numbers)
            println(num)
    }
}