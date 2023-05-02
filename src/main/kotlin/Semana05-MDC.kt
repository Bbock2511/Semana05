fun main(){
    print("Digite o primeiro termo para o MDC: ")
    val x = readln().toInt()
    print("Digite o segundo termo para o MDC: ")
    val y = readln().toInt()
    println("O MDC entre os dois termos é ${mdc(x, y)}")
}

fun mdc(a: Int, b: Int): Int{
    return if (a%b == 0){
        b
    }
    else{
        mdc(b, (a%b))
    }
}