fun main() {
    print("Digite uma palavra: ")
    val palavra = readln()

    println("$palavra é um palíndromo? ${verificarPalindromo(palavra)}")
}

fun verificarPalindromo(palavra: String): Boolean {
    return if (palavra.length <= 1) {
        true
    } else if (palavra.first() == palavra.last()) {
        verificarPalindromo(palavra.substring(1, palavra.length - 1))
    } else {
        false
    }
}
