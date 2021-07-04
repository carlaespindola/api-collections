package one.digitalinnovation.collections

fun main() { //mais flexivel para adicionar mais capacidade no array
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }

    println("----------------")
    values.sort()
    values.forEach {
        println(it)
    }
}