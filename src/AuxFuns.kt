fun less (x: Char, y: Char): Boolean = x < y

fun exch(a: CharArray, x: Int, y: Int) {
    //Para fazer uma troca, é sempre necessário 3 instruções (Triângulo).
    val aux = a[x]
    a[x] = a[y]
    a[y] = aux
}

fun lessExch(a: CharArray, i: Int, j: Int){
    if (less(a[i], a[j])) {
        exch(a, i, j)
    }
}
