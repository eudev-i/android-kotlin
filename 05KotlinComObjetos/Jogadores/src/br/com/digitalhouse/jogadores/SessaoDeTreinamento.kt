package br.com.digitalhouse.jogadores

class SessaoDeTreinamento () {

    val experiencia: Int = 1

    fun treinarA(jogadorDeFutebol: JogadorDeFutebol){

        println("A experiência inicial do jogador ${jogadorDeFutebol.nome} é ${jogadorDeFutebol.experiencia}")

        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()

        jogadorDeFutebol.experiencia += experiencia

        println("A experiência final do jogador ${jogadorDeFutebol.nome} é ${jogadorDeFutebol.experiencia}")
    }
}