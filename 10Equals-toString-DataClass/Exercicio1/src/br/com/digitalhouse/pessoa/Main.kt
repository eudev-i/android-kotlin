package br.com.digitalhouse.pessoa

fun main(){

    //Criando 2 pessoas
    var pessoa1 = Pessoa("Vitoria", 123456789)
    var pessoa2 = Pessoa("Meguen", 123456789)

    //Comparando o objeto pessoa
    println(pessoa1.equals(pessoa2))
}