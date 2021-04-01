package Exercicio1

fun main() {
    val entrada: Float = readLine()!!.toFloat()
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    //variavel pra cast to Float
    val salario = entrada.format(2).toFloat()
    var imposto = 0F

    if (salario <= 2000) {
        imposto = 0F
    }  else if (salario > 2000.00 && salario <= 3000.00) {
        imposto = ((salario-2000)*(0.08)).toFloat()
    }
     else if (salario > 3000.00 && salario <= 4500.00 ) {
        imposto = (80 + ((salario-3000)*0.18)).toFloat()
    } else if (salario > 4500) {
        imposto = (80+270+((salario-4500)*0.28)).toFloat()
    }
            if (imposto == 0F) println("Isento")
            else println("R$ ${imposto.format(2)}")
}