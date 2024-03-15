package exerc5

fun main() {

    println("Conjunto congruentes a 6 (mod 13) menores que 100:")
    var numero = 0;
    var operador = 0;

    var exampleArray = emptyArray<Int>()

    while (numero < 100) {
        numero = 13 * operador + 6;
        if (numero < 100)
            exampleArray += numero
        operador++;
    }

    println(exampleArray.joinToString())
}