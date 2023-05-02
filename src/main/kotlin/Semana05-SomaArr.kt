fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val soma = somaArray(arr, arr.size)
    println("A soma dos elementos do array é $soma")
}

fun somaArray(arr: IntArray, n: Int): Int {
    return if (n == 0) {
        0
    }else {
        arr[n - 1] + somaArray(arr, n - 1)
    }
}
