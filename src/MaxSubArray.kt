//Maximum SubArray Problem, Quadratic, O(n^2)
//Triple - 1st Pos, 2nd Pos, Max Sum
data class Triple(val a: Int, val b: Int, val c: Int)
fun MaxSubArr(arr: IntArray, left: Int, right: Int): Triple {
    var l: Int = left
    var r: Int = right
    //Assume que a melhor soma está no intervalo [left,left]
    var sum: Int = arr[l]
    var aux = 0
    for (i in left..right) {
        for (j in l+1..right){
            aux += arr[j]
            if(aux > sum) {
                l = i
                r = j
                sum = aux
            }
        }
    }
    return Triple(l, r, sum)
}

//TPC: Algoritmo de Kadane, Linear, O(n)