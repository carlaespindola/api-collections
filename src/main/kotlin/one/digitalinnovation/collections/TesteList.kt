package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it)} //it é o funcionario - Joao, Pedro ou Maria

    println("-----------------------")
    println(funcionarios.find {it.nome == "Maria" })

    println("-----------------------")
    funcionarios
        .sortedBy { it.salario } //ordem menor ao maior
        .forEach { println(it) } //operação coletora

    println("-----------------------")
    funcionarios
        .groupBy { it.tipoContratacao } //tipo de agrupamento
        .forEach { println(it) } //operação coletora, imprime o resultado obtido - é criado um MAPA, com chave e elementos

    /*nesse exemplo, não conseguimos inserir mais um funcionario pois estamos usando a lista do api collections. Iremos ver essa inserção nas mutableList*/

}

data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipoContratacao:String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
}