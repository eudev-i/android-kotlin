package br.com.digitalhouse.escola

class Aluno (var ra: Int, var nome: String, var sobrenome: String) {

    fun assistirAulas(): Boolean{
        println ("O aluno ${nome} está assistindo as aulas")
        return true
    }

    fun fazerLicoesDeCasa(): Boolean{
        println ("O aluno ${nome} está fazendo as lições de casa")
        return true
    }
}