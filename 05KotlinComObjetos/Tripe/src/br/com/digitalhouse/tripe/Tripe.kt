package br.com.digitalhouse.tripe

class Tripe (val alturaMinima : Int, val alturaMaxima : Int) {

    var dobrado: Boolean = true
        private set
    var alturaAtual: Int = (alturaMaxima + alturaMinima) / 2
        private set

    fun definirAltura(novaAltura : Int){
        println("Altura alterada de $alturaAtual para $novaAltura")
        this.alturaAtual = novaAltura
    }

    fun dobrar(){
        when (dobrado) {
            false -> {
                println("Dobrando o Tripé")
                this.dobrado = true
            }
            else -> {
                println("O tripé está dobrado")
            }
        }

    }

    fun desdobrar() {
        when (dobrado) {
            true -> {
                println("Desdobrando o Tripé")
                this.dobrado = false
            }
            else -> {
                println("O tripé está desdobrado")
            }
        }
    }

    fun prontoParaGuardar(): Boolean = dobrado && alturaAtual == alturaMinima
    fun guardar() {
        dobrar()
        definirAltura(alturaMinima)
        println("O Tripé está pronto para guardar? -> ${prontoParaGuardar()}")
    }

    fun usar() {
        desdobrar()
        definirAltura(160)
        println("Tripé pronto para usar? -> ${prontoParaUsar()}")
    }

    fun prontoParaUsar(): Boolean = !dobrado && alturaAtual > (alturaMaxima/2)
}

