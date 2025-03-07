//Fazer uma função que cria um arr com um certo size, e mete em cada posição um random number de um range. Meter no Aux.
//size = 15

//T-O(n^2), E-O(n)
fun insertionSort1(a: CharArray, left: Int, right: Int) {
    //As alterações que forem feitas no array, são vistas no main.
    //Ex: arr[0] = 'z'
    var i = left+1
    while (i <= right) {
        var j = i
        while (j > left) {
            lessExch(a, j, j-1)
        }
        ++i
    }
}

//T-O(n^2), E-O(n)
fun insertionSort2(a: CharArray, left: Int, right: Int) {
    //As alterações que forem feitas no array, são vistas no main.
    //Ex: arr[0] = 'z'
    var i = left + 1
    while (i <= right) {
        var j = i
        while (j > left) {
            //type mismtch?
            if (less(a[j], a[j - 1])) exch(a, j, j - 1)
            else break
            j--
        }
        ++i
    }
}
