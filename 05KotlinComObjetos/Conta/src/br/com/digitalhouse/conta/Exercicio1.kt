package br.com.digitalhouse.conta

fun main (){
    val cliente1 = Cliente("Vitoria", "Gonçalves")
    val cliente2 = Cliente("Clara", "Bispo")

    val conta1 = Conta(2967, 3000.0, cliente1)
    val conta2 = Conta(1028, 2500.0, cliente2)

    conta1.deposito(100.0)
    conta1.saque(400.0)

    conta2.deposito(900.0)
    conta2.saque(250.0)
}