fun calcularProm(listNum: List<Int>): Int{
    val suma =  listNum.reduce {x, y -> x + y}
    val cant = listNum.size
    return suma/cant
}

fun isPalindrome(texto: String): Boolean{
    var texto = texto.lowercase()
    return texto == texto.reversed()
}

fun performOperation(a: Int, b:Int, f:(Int, Int) -> Int): Int{
    return f(a, b)
}

fun main() {
    val lista = listOf(3,2,5,1,6,8,9)
    //1 ejercicio
    val promedio = calcularProm(lista)
    println("El promedio es: $promedio")
    println("-------")
    //2 ejercicio
    val listImpares = lista.filter {it % 2 != 0}
    println("Lista original: $lista")
    println("Números impares: $listImpares")
    println("-------")
    //3 ejercicio
    val palindrome = isPalindrome("radar")
    println("Es palindrome: $palindrome")
    println("-------")
    //4 ejercicio
    val nombres = listOf("Iris", "Anggie", "Bran", "Jony", "Dom", "Luis")
    val mapa = nombres.map { nombre -> "Hola, $nombre" }
    mapa.forEach { x -> println(x) }
    println("-------")
    //5 ejercicio
    val multResult = performOperation(5, 3) { x, y -> x * y }
    println("Multiplicación: $multResult")

}