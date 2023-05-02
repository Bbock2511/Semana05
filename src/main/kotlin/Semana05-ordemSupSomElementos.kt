fun main(){
    val numeros = listOf(1, 2, 3, 4, 5)
    val soma = numeros.reduce { acc, n -> acc + n }
    println(soma)
}