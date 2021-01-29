package br.com.digitalhouse.estoque

fun main(){

    var estoque = Estoque("Bolsa", 0, 0)
    estoque.mudarNome("Necessaire")
    estoque.darBaixa(estoque.atual)
    println(estoque.mostra())
    println(estoque.precisaRepor())
    estoque.repor(estoque.atual)
}