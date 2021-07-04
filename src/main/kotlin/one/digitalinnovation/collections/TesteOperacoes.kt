package one.digitalinnovation.collections
//operações com arrays
fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("--------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("--------------------------")
    salariosMaiorQue2500.forEach{ println(it)}

    println("--------------------------")
    println(salarios.count { it in 2000.0..5000.0 }) //range - retorna o nro de elementos que estão dentro do intervalo

    println("--------------------------")
    println(salarios.find { it == 2250.0 }) //podemos usar para identificar o nro da conta bancária - find localiza e trás o elemento identico

    println("--------------------------")
    println(salarios.find { it == 550.0 }) //retornou null pois não encontrou o elemento

    println("--------------------------")
    println(salarios.any { it == 1000.0 }) //a resposta será true ou false, pois ele indica se encontrou ou não, dentro da nossa
    //coleção, o elemento que pedimos

    println("--------------------------")
    println(salarios.any { it == 500.0 })
}