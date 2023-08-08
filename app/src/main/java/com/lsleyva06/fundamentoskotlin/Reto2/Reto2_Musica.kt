package com.lsleyva06.fundamentoskotlin.Reto2

class Reto2_Musica { }
// no utilice la clase ya que en la formación no alcanzamos aprender

fun main() {

    // creación de las listas
    // el pair es utilizado para crear una estructura que almacene dos valores juntos, en este caso es para el titulo y artista
    val canciones = mutableListOf<Pair<String, String>>()
    val apublicacion = mutableListOf<Int>()
    val recuento = mutableListOf<Int>()

    println("Ingrese la cantidad de canciones que desea agregar")
    var can = readLine()!!.toInt()

    for (i in 1..can) {

        //Este for sirve para las caracteristicas del album
        println("Ingrese el tipo de musica ej (Rock,Jazz,Pop,etc)")
        var tipo = readLine()!!.toString()
        //Creación del cuerpo de las canciones
        println("canción $i:")
        println("Titulo:")
        var ti = readLine()!!.toString()

        println("Artista:")
        var ar = readLine()!!.toString()

        println("Año de publicación:")
        var apubli = readLine()!!.toInt()
        //el add sirve para agregar en la lista en la cual se especifique
        apublicacion.add(apubli)

        println("Recuento de las reproducciones")
        var rep = readLine()!!.toInt()
        recuento.add(rep)

        /* esta es la complementación del pair arriba en este caso sirve para crear cada vez una iteración
        cada vez que se ejecute el for */
        canciones.add(ti to ar)
    }
    // sirve para rastrear la mas popular y el recuento
    var popular = ""
    var mreproducciones = 0

    //el until funciona donde nos permire crear un rango semiabierto que excluye el limite superior ej  [0,5)
    for (i in 0 until can){

        if (recuento[i] > mreproducciones){
            mreproducciones = recuento[i]
            popular  = "${canciones[i].first},interpretada por ${canciones[i].second} \n"
        }
    }

    println("La canción mas popular es ${popular} con numero de reproducciones ${mreproducciones} \n")

    println("El nivel de popularidad de las canciones en el album es \n")
    for (i in 0 until can ){
        /* el "popular" else "poco ´popular" significa que si se cumple la condición
        en la variable se guarda la canción en popular si no es asi cumple el else
        y se convieete en poco popular*/
        val top = if (recuento[i] >= 1000) "popular" else "poco ´popular"
        println("${canciones[i].first} - $top \n")
    }

    println("Descripción de la canción o canciones \n")
    //el until funciona donde nos permire crear un rango semiabierto que excluye el limite superior ej  [0,5)
    for (i in 0 until can) {
        println("${canciones[i].first},interpretada por ${canciones[i].second},se lanzo en el año ${apublicacion[i]},cantidad de reproduciones ${recuento[i]}")
    }
}