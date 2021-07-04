package one.digitalinnovation.collections

fun main() {

    val pair: Pair<String, Double> = Pair("João", 1000.0) //par
    val map1 = mapOf(pair) //a chave e o valor gera um mapa

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println("-----------------------------")
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    ) //recurso infix
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}