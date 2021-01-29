package br.com.digitalhouse.loteria

fun main(){
    var listaLoteria = mutableMapOf<Int, String>()

    listaLoteria[0] = "Ovos"
    listaLoteria[1] = "Água"
    listaLoteria[2] = "Escopeta"
    listaLoteria[3] = "Cavalo"
    listaLoteria[4] = "Dentista"
    listaLoteria[5] = "Fogo"

    for (item in listaLoteria){
        println(item)
    }
}
