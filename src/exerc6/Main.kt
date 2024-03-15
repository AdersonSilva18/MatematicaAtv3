package exerc6

fun main() {

    val scanner = java.util.Scanner(System.`in`)
    println("Esreva o a para pegar seu residuo")
    var a = scanner.nextInt();

    println("Escreva o MOD")
    var mod = scanner.nextInt();

    println("o reisiduo de $a por $mod é: ${a % mod}")
}