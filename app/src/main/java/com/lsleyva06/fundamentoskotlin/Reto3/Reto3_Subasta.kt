package com.lsleyva06.fundamentoskotlin.Reto3

fun main (){

    //mapOf en Kotlin se utiliza para crear un  diccionario inmutable

    val objectos: Map<String, Int> = mapOf( Pair("televisor", 800000),
        Pair("horno", 400000),
        Pair("ventilador", 250000),
        Pair ("lavadora",2000000 ))

    val participantes = listOf<String>("jugador 1","jugador 2", "jugador 3","jugador 4")
    //permite recorrer un elemento de manera secuencial
    val iterator = objectos.iterator()

    /* hasNext() sirve para comprobar los valores existentes en el cual este dentro del rango
     el metodo next guarda el valor de la variable actualizando el siguiente*/

    while (iterator.hasNext()){
                val (elec, base) = iterator.next()
                 println("Bienevenido a la subasta del dia hoy, en el cual se subastara $elec con precio base de $base")

                var ofertamayor = base
                var ganador = "Se queda en la casa"

                for (i in participantes) {
                    println("La actual subasta $elec")
                    println("$participantes ingrese su oferta de lo contrario si desea saltar a la otra subasata escriba 'siguiente'")
                    var res = readLine()!!.toString().lowercase()

                    if (res == "siguiente") {
                        continue
                    }

                    val sigu = res.toInt()
                    if (sigu > ofertamayor) {
                        ofertamayor = sigu
                        ganador = i
                        println("Compra exitosa")
                    } else {
                        println("Disculpa la oferta debe ser mayor a $ofertamayor, perdiste tu turno :(")
                    }

                }

                if (ganador == "Se queda en la casa") {
                    println("No se alcanzo el precio base para $elec, el producto se queda en la casa por el precio base ")
                } else {
                    println("El ganador de la subasta del $elec es $ganador con el valor ganador de $ofertamayor")
                }
    }


}