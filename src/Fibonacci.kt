//Recursivo, Sem Array
//T-O(2^n), E-O(n)
fun fib1(a: Int): Int {
    return if (a == 0 || a == 1) a
    else fib1(a - 1) + fib1(a - 2)
}

//Recursivo, Com Array
//T-O(n), E-O(n)
fun fib2(n : Int): Int {
    val arr = IntArray(n+1)
    arr[0] = 0
    arr[1] = 1
    for (i in 2..n) {
        arr[i] = arr[i-1]+arr[i-2]
    }
    return arr[n]
}

//Iterativo, Sem Array (incompleto)
//
fun fib3(a : Int): Int {
    var x = 0
    var y = 1
    var z = x + y
    for (i in 0..a) {
        if (a == 0) {
            return x
        } else if (a == 1) {
            return y
        } else {
            z
            x = y
            y = z
        }
    }
    return z
}
