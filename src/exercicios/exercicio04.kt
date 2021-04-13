package exercicios

import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {
    while (true) {
        try {
            var quantidade = readLine()!!.toInt()
            val velocidade = readLine()!!
                .split(" ")
                .map{it.toInt()}
                .sorted()
                .last()
            when (velocidade) {
                in 0..9 -> println("1")
                in 10..19 -> println("2")
                else -> println("3")
            }

        } catch (f :  NumberFormatException) {
            break
        } catch (n : NegativeArraySizeException) {
            break
        } catch (e : NullPointerException) {
            break
        }
    }
}