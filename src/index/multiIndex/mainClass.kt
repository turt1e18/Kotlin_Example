package index.multiIndex

class MultiIndex{ //2차원 배열
    val num1 = arrayOf(4,11,7,3)
    val num2 = arrayOf(1,2,6,8)
    val num3 = arrayOf(12,5,10,9)

    fun play(){
        for(element in num1)
            println(element)
        for(element in num2)
            println(element)
        for(element in num3)
            println(element)
    }

    val arr2d = arrayOf(num1,num2,num3)

    fun play2d(){
        for(element1 in arr2d){
            for(element2 in element1){
                println(element2)
            }
        }
    }
}

fun main(){
    var multi1 = MultiIndex()
    multi1.play2d()
}