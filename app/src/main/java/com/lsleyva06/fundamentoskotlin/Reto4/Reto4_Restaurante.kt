package com.lsleyva06.fundamentoskotlin.Reto4

fun main() {
    //HashMap sirve para agregar tres tipos de datos diferentes en un diccionario
    val entrada = HashMap<String,Any>()
    //elementos del diccionario
    entrada["nombre"] = "patacones"
    entrada["descripcion"] = "Deliciosos patacones rellenos "
    entrada["precio"] = 8000

    val fuerte = HashMap<String,Any>()
    //elementos del diccionario
    fuerte["nombre"] = "Arroz con pollo"
    fuerte["descripcion"] = "Adicción de papas f ritas "
    fuerte["precio"] = 35000

    val postres = HashMap<String,Any>()
    //elementos del diccionario
    postres["nombre"] = "flan"
    postres["descripcion"] = "Un rico flan de mora y maracuya "
    postres["precio"] = 18000

    val bebida = HashMap<String,Any>()
    //elementos del diccionario
    bebida["nombre"] = "limonada de coco"
    bebida["descripcion"] = "servida con hielo"
    bebida["precio"] = 8000
    var can=1
    var i=0
    while (can==1){

        println("Escoja la categoria a la cual desea ingresar escogiendo el numero de ejemplo (1.Entrada, 2.Fuerte,3.Postres,4.Bebida)")
        var ingreso = readLine()!!.toInt()

        when(ingreso){

            1 -> if (ingreso==1) {println("Esta es la categoria de entrada")
                    println("Ingrese el nombre del plato ")
                    entrada["nombre"] = readLine()!!.toString()
                    println("Descripcion del plato")
                    entrada["descripcion"] = readLine()!!.toString()
                    println("Precio")
                    entrada["precio"] = readLine()!!.toString()
                    println("${entrada["nombre"] }")}

            2 -> if (ingreso==2){println("Esta es la categoria de Platos fuertes")
                    println("Ingrese el nombre del plato ")
                    fuerte["nombre"] = readLine()!!.toString()
                    println("Descripcion del plato")
                    fuerte["descripcion"] = readLine()!!.toString()
                    println("Precio")
                    fuerte["precio"] = readLine()!!.toString()
                    println("$fuerte")}

            3 -> if (ingreso ==3){println("Esta es la categoria de postres")
                    println("Ingrese el nombre del plato ")
                    postres["nombre"] = readLine()!!.toString()
                    println("Descripcion del plato")
                    postres["descripcion"] = readLine()!!.toString()
                    println("Precio")
                    postres["precio"] = readLine()!!.toString()
                    println("$postres")}

            4 -> if (ingreso==4){println("Esta es la categoria de bebida")
                    println("Ingrese el nombre del plato ")
                    bebida["nombre"] = readLine()!!.toString()
                    println("Descripcion del plato")
                    bebida["descripcion"] = readLine()!!.toString()
                    println("Precio")
                    bebida["precio"] = readLine()!!.toString()
                    println("$bebida")}

            else -> println("Dato incorrecto")

        }

        //modificar un elemento de la lista
        val modificar = "nombre"
        if (entrada.containsKey(modificar)){
            entrada[modificar] = "empanadas crunch"
            println("dato modificado: $modificar = ${entrada[modificar]}")
        }else {
            println("el dato modificado no es correcto ")
        }

        // eliminar una entrada del diccionario
        println("Ingrese lo que desea eliminar del diccionario entrada (nombre, descripción o precio)")
        var eliminar = readLine()!!.toString()

        if (eliminar == "${entrada}"){
            (entrada.remove(eliminar))
            println("se eliminara el nombre del nombre plato $entrada")
        }else{
            println("El elemento ingresado no se puede modificar")
        }

        //cuenta lo que se ingreso anteriormente y muestra un recorrido de este
        println("Este es el completo de entrada")
        for ((clave,valor) in entrada){
            println("$clave: $valor")}

        i+=1

        println("Desea ingresar otro plato digite 1 para si y 0 para no")
        can=readLine()!!.toInt()

    }
}