package com.lsleyva06.fundamentoskotlin.Reto1

import kotlin.random.Random

fun main() {
    val inicio = 0
    val final = 200

    var ve = 1
    var i = 0

    while (ve == 1) {

        // el +1 sirve para contar el número que esté en el rango, en este caso para contar el 200
        /* La variable numaleatorio esta dentro del bucle para funcione y cada que la persona
         diga que si cambia el numero*/
        val numaleatorio = Random.nextInt(inicio, final + 1)
        println("Estas son las notificaciones que tiene su celular:$numaleatorio")

        when {
            numaleatorio <= 0 -> println("Usted no tiene ningún mensaje")
            numaleatorio < 100 -> println("Usted tiene menos de 99 notificaciones")
            numaleatorio >= 100 -> println("Usted tiene 100 o más notificaciones")
        }

        i += 1

        println("Desea volver a revisar la cantidad de notificaciones? Ingrese 1 para sí y 0 para terminar")
        ve = readLine()!!.toInt()
    }
}
