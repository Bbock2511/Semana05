fun main() {
    val lista = listOf(10, 5, 8, 20, 3)
    val maior = lista.maxByOrNull { it }
    println("O maior valor da lista é $maior")
}
