fun main() {
    val lista = listOf("banana", "maçã", "uva", "abacaxi", "laranja")

    val listaOrdenada = lista.sortedBy { it }

    println("Lista original: $lista")
    println("Lista ordenada em ordem decrescente: $listaOrdenada")
}
