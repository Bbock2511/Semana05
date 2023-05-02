fun main() {
    print("Digite a mensagem: ")
    val mensagem = readln()
    print("Quantas vezes repetir: ")
    val n = readln().toInt()
    repetirMensagem(n, mensagem)
}

fun repetirMensagem(n: Int, message: String) {
    for (i in 1..n) {
        println(message)
    }
}