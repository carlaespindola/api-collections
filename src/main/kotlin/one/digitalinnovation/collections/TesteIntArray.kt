package one.digitalinnovation.collections

fun main() {
    //necessário informar a capacidade do array (tamanho)
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //para a iteração - valor é a variável
    for (valor in values) {
        println(valor)
    }

    println("--------------------")
    values.forEach {
        println(it)
        //values.forEach { valor ->
        //println(valor)
    //}
    }

    println("--------------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("--------------------")
    values.sort() //sort: recurso que ordena os elementos do array, por padrão, do menor para o maior
    for (valor in values) {
        println(valor)
    }
}