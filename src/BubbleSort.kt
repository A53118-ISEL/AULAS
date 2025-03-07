fun bubbleSort1(arr: CharArray, left: Int, right: Int) {
    for (i in left until right) {
        for (j in right downTo i+1){
            lessExch(arr, j, j-1)
        }
    }
}

//TPC: Implementar bubblesort2, que faz apenas uma passagem no caso de estar ordenado (usa uma variavel booleana)