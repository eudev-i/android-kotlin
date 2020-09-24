package br.com.digitalhouse.veiculos

fun main() {
    val cliente = Cliente("Vitoria", "Gonçalves", "vitoria@digitalhouse.com")
    val onix = Veiculo("Chevrolet", "Onix", 2020, "Preto", 1000.1)

    val concessionaria = Concessionaria()
    concessionaria.registrarVenda(onix, cliente, 30000.0)
    println(concessionaria.registroDeVendas)
}