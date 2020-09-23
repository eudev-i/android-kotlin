package br.com.digitalhouse.jogadores

class JogadorDeFutebol (val nome: String) {

    var energia: Int = 0
    var alegria: Int = 0
    var gols: Int = 0
    var experiencia: Int = 0

    fun fazerGol() {
        energia -= 5
        alegria += 10
        gols += 1
        println("GOOOOL!")
    }

    fun correr() {
        energia -= 10
        println("Cansei")
    }

    fun resultadoJogador(){
        println("O jogador ${nome} tem energia ${energia}, alegria ${alegria}, número de gols ${gols} e experiência ${experiencia} \n")
    }
}