package one.digitalinnovation.collections
//set são conjuntos
fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2) //conjunto 1 unido com o conjunto 2
    resultUnion.forEach { println(it) }

    println("---------------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2) //subtract retira o que há de comum entre os conjuntos
    resultSubtract.forEach { println(it) }

    println("---------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2) //intersect retorna o que há em comum nos conjuntos
    resultIntersect.forEach { println(it) }

}
