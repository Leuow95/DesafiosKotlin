package exercicios

fun main(args: Array<String>) {

    for (i in 1..readLine()!!.toInt()) {
        val entrada = readLine()!!
            .split(" ")
            .map { it.toInt() }
        println(mdc(entrada[0], entrada[1]))
    }

}
// máximo divisor comum (chamada recursiva)
fun mdc(bolo1: Int, bolo2: Int): Int {
    if(bolo2==0) return bolo1
    else return mdc(bolo2, bolo1 % bolo2)
}