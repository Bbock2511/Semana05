fun main(){
    print("Digite o número para fazer o cálculo de fatorial: ")
    val num = readln().toInt()
    println("O fatorial de $num é ${fatorial(num)}")
}

fun fatorial(x: Int): Int{
    return if (x == 0 || x == 1){
        1
    } else{
        x * fatorial(x-1)
    }
}