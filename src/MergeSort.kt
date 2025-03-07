//TPC

//T-O(n1+n2), E-O(n1+n2)
fun merge(ar: IntArray, arr: IntArray, merged: IntArray) {
    var i1 = 0
    var i2 = 0
    var i3 = 0
    while (i1 < ar.size && i2 < arr.size) {
        if (ar[i1] < arr[i2]) {
            merged[i3] = ar[i1]
            ++i1
        }
        else {
            merged[i1] = arr[i2]
            ++i2
        }
        ++i3
    }
    //Já copiou um dos arrays
    while (i1 < ar.size) merged[i3++] = ar[i1++]
    while (i2 < arr.size) merged[i3++] = arr[i2++]
}

fun mergeSort(arr1: IntArray, left: Int, right: Int) {
    //caso paragem
    //subarray -> dim = 0 ou dim = 1
    val arr = intArrayOf(13,-1,2,10,1,9,7,-2)
    if (left >= right) {
        return
    }
    val mid = (left + right) / 2
    // ordena esquerda
    mergeSort(arr, left, mid)
    // ordena direita
    mergeSort(arr, mid+1, right)
    //duas metades já ordenadas
    //merge(arr, left, mid, right) <- Tem de ser criada
}