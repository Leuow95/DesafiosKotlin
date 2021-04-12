package exercicios

fun isPrime(entrada: Long) : Boolean{
    var raiz = kotlin.math.sqrt(entrada.toDouble()).toInt()
    if (entrada < 2) return false
    for (i in 2..raiz) {
        if (entrada % i == 0L) return false
    }
    return true
}
fun main() {
    //Recebe a quantidade de numeros que serão inseridos e converte pra LONG
    val qtdEntradas = readLine()!!.toLong()
    //Percorre todas as entradas do usuario
    for (i in 1..qtdEntradas){
        var entrada = readLine()!!.toLong()
        if(isPrime(entrada)) println("Prime")
        else(println("Not Prime"))
    }
}