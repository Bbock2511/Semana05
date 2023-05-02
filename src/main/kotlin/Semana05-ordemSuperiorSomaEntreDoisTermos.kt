fun main(){
    val minhaSoma = soma()
    val resultado = minhaSoma(2, 3)
    println(resultado) 
}

fun soma(): (Int, Int) -> Int {
    return { a, b -> a + b }
}
