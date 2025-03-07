//T-O(n), E-O(n)
fun pow1(a : Int, n : Int): Int {
    if (n == 0) return 1
    else return a * pow1(a, n-1)
}

//T:O(log2(n)), E-O(log2(n))
fun pow2(a: Int, n: Int): Int {
    if (n == 0) return 1
    val z = pow2(a, n / 2)
    return if (n % 2 == 0) z * z else z * z * a
}
