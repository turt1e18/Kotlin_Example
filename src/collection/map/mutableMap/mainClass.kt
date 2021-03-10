package collection.map.mutableMap

fun main(){
    val capCityMap: MutableMap<String,String> = mutableMapOf("kr" to "seoul", "ch" to "beijing", "jp" to "tokyo")
    println(capCityMap.values)
    println(capCityMap.keys)

    capCityMap.put("uk","london")
    capCityMap.remove("ch")
    println(capCityMap)
}