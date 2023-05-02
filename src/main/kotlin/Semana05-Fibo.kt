fun main(){
    print("Digite o termo que deseja da sequência de Fibonacci: ")
    val nesimo = readln().toInt()
    println("O ${nesimo}º termo da sequência é ${fibonacci(nesimo)}")
}

fun fibonacci(x: Int): Int {
    return if (x == 1) 0
    else{
        if (x == 2) 1
        else {
            fibonacci(x - 1) + fibonacci(x - 2)
        }
    }
}