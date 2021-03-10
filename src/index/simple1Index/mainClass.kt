package index.simple1Index

class SimpleIndex { //1차원 배열
    val numbers = arrayOf(4,5,7,3)
    val animals = arrayOf("Cat","Dog","Lion")
    fun play(){
        for(element in numbers){
            println(element)
        }

        for(element in animals){
            println(element)
        }
    }
}

fun main(){
    var index1 = SimpleIndex()
    index1.play()
}