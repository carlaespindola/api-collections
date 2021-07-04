package one.digitalinnovation.collections

//simulação de um banco de dados

class Repositorio<T> { //recebe T generico
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map.get(id)

    fun findAll() = map.values
}