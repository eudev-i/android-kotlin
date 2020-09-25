package br.com.digitalhouse.impressora

class Impressora {

    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionarImprimivel(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)
    }

    fun imprimirTudo() {
        for (imprimivel in listaImprimivel) {
            imprimivel.imprimir()
        }
    }
}