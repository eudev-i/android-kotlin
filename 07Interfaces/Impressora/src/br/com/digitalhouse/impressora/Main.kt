package br.com.digitalhouse.impressora

fun main() {

    var contrato = Contrato("Contrato Digital House", "contrato")
    var foto = Foto("Foto de perfil", "png")
    var documento = Documento("RG", "Identidade")
    var impressora = Impressora()

    impressora.adicionarImprimivel(contrato)
    impressora.adicionarImprimivel(foto)
    impressora.adicionarImprimivel(documento)
    impressora.imprimirTudo()

}