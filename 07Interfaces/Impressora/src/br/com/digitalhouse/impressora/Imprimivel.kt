package br.com.digitalhouse.impressora

interface Imprimivel {
    var nome: String
    var tipo: String

    fun imprimir()
}