package one.digitalinnovation.collections

//classe array, que espera um tipo <string>, o tamanho (3) e a inicialização { }
fun main() {
    val nomes = Array(3) { "" }
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("----------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("----------------------")
    //arrayOf já declaramos e o sistema infere o tipo
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}