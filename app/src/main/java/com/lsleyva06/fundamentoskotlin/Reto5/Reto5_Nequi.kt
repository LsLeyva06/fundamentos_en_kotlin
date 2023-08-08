package com.lsleyva06.fundamentoskotlin.Reto5

import kotlin.random.Random

fun main() {
    //Un usuario y contraseña prederterminado en este caso quise ya tenerlo almacenado
    val correctotel = "3053389089"
    val correctocla = "1245"
    val longitudes = 4
    // padEnd es para una longitud especifica especialmentre
    val clave =correctocla.padEnd(longitudes, '0')

    var saldoini = 4500
    // variables para numeros random
    val cant = 6
    val nummi = 0
    val numma = 9
    val numerosAleatorios = mutableListOf<Int>()

    var ve = 3
    var i = 0


    while (ve > 0) {
        println("Ingrese numero de telefono ")
        var telefono = readLine()
        println("Ingrese la clave de 4 digitos")
        var clave = readLine()



        if (telefono == correctotel && clave == correctocla) {
            println("Ingreso exitoso")
            println("Saldo disponible es $saldoini")
            //un bucle para mientras este correcta contraseña podra realizar las funciones como desee
            while (telefono == correctotel && clave == correctocla){

                println("Escoge la función que deseas realizar ej (1.Sacar,2.envia,3.recarga y 4.salir)")
                var funcion = readLine()!!.toInt()
                //condicional when para las funciones
                when(funcion){

                    1 -> { println("Ingresaste a la función saca, tienes dos opciones 1.punto fisico y 2.retirar en cajero")
                        var funcion1 = readLine()!!.toInt()
                        
                        if (funcion1 == 1 ){
                            println("Haz seleccionado opcion 1.punto fisico")
                                //condicion para si es menor a 2000 no se genra el codigo para retirar
                                if (saldoini < 2000){
                                    println("No te alcanza para retirar")
                                    break
                                }else {
                                    for (i in 1..cant){
                                        val aleatorio = Random.nextInt(nummi, numma)
                                        numerosAleatorios.add(aleatorio)}
                            }
                             // La función joinToString() maneja varios parametrosy en este caso es para separador entre elementos
                            val numerosSinCorchetes = numerosAleatorios.joinToString(" ")
                            println("Para sacar, confirmale este codigo a la persona encargada del corresponsal: $numerosAleatorios")

                        }else if (funcion1 == 2 ){
                            println("Haz seleccionado opcion 1.retirar en cajero")
                            //condicion para si es menor a 2000 no se genra el codigo para retirar
                            if (saldoini < 2000){
                                println("No te alcanza para retirar")
                                break
                            }else {
                                for (i in 1..cant){
                                    val aleatorio = Random.nextInt(nummi, numma)
                                    numerosAleatorios.add(aleatorio)}
                            }
                            // La función joinToString() maneja varios parametrosy en este caso es para separador entre elementos
                            val numerosSinCorchetes = numerosAleatorios.joinToString(" ")
                            println("Para sacar en tu cajero, confirmale este codigo : $numerosAleatorios")

                        }else{
                            println("Dato ingresado no existente")

                        }
                    }

                    2 -> {println("Ingresaste a la función envia")
                          println ("Ingresa numero de telefono el cual deseas enviar el monto")
                          var num = readLine()
                          println("Ingrese el monto que desea enviar")
                          var monto = readLine()!!.toDouble()
                          println("Agrega mensaje")
                          var des = readLine()!!.toString()

                        if (monto <= saldoini){
                            println("Envio realizado correctamente")
                            println( "se envio un monto de $monto al numero de telefono $num con el siguiente mensaje $des" )
                            println("Su saldo actual es de ${saldoini-monto}")
                        }else{
                            println("No es posible enviar el dinero")}
                    }

                    3 -> {println("Ingresaste a la función recargar")
                        println("Ingrese el valor de la recarga")
                        var recar = readLine()!!.toInt()
                        println("Esta seguro de hacer la recarga si es asi escriba si, de lo contrario escriba no y lo llevara al menu de nuevo ")
                        var confir = readLine().toString().lowercase()
                        if(confir == "si"){
                            println("Recarga exitosa!!, su nuevo saldo es de ${recar+saldoini}")
                        }else {
                            println("Salida exitosa")
                            return
                        }
                    }

                    4 -> {println ("Ingresaste a la función salir, preiona x para salir del sistema" )
                        var a = readLine()!!.toString().lowercase()
                        if (a == "x"){
                            println("salida exitosamente")
                            return //para terminar el programa
                        }else {
                            println("Dato ingresado incorrecto")}
                    }

                }

            }
            //El break sirve para pasar el control solo en un bucle
            break
        } else {
            println("¡UPPS! parece que tus datos de ingreso no son correctos,verifica tu numero de telefono y clave ,Tienes $ve intentos más")
            // registro del número, cada vez que pase un intento se resta uno
            ve--
        }

        i += 1
        if (ve == 0) {
            println("Se agotaron los intentos. Acceso denegado.")
        }
    }
}