package br.com.digitalhouse.escola

class Professor (var nome: String, var registroDocente: Int) {

    fun darAulas(): Boolean{
        println("O professor ${nome} está dando aulas")
        return true
    }

    fun fazerChamada(): Boolean{
        println("O professor ${nome} está fazendo a chamada")
        return true
    }
}