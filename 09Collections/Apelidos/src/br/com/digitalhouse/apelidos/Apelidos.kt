package br.com.digitalhouse.apelidos

fun main(){
    var listaApelidos = mutableMapOf<String, String>()

    listaApelidos["João"] = "Juan, Fissura, Maromba"
    listaApelidos["Miguel"] = "Night Watch, Brunce Wayne, Tampinha"
    listaApelidos["Maria"] = "Wonder Woman, Mary, Marilene"
    listaApelidos["Lucas"] = "Lukinha, Jorge, George"

    for (item in listaApelidos){
        println(item)
    }
}