package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0)
    val pedro = Funcionario("Pedro", 1500.0)
    val maria = Funcionario("Maria", 4000.0)

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it)} //it é o funcionario - Joao, Pedro ou Maria

    println("-----------------------")
    println(funcionarios.find {it.nome == "Maria" })

    println("-----------------------")
    funcionarios
        .sortedBy { it.salario } //ordem menor ao maior
        .forEach { println(it) } //operação coletora
}

data class Funcionario(
    val nome:String,
    val salario:Double
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
}