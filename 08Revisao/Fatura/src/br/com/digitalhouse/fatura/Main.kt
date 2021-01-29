package br.com.digitalhouse.fatura

fun main(){

    var item = Item(0, "Mouse", 2, 1.00)

    println("Número da fatura: ${item.numeroItem}")
    println("Descrição do item: ${item.descricao}")
    println("Quantidade: ${item.quantidade}")
    println("Preço unitário: ${item.preco}")
    println(item.getTotalFatura())
}