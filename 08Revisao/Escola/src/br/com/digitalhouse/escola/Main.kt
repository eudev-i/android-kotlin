package br.com.digitalhouse.escola

fun main(){
    //Cadastro de matéria
    var materia1 = Materia("Programação Orientada a Objetos")
    var materia2 = Materia("Android Core")
    var materia3 = Materia("Web Services")

    //Cadastro de alunos
    var aluno1 = Aluno(123, "Marina", "Saito")
    var aluno2 = Aluno(456, "Victor", "Rubens")
    var aluno3 = Aluno(789, "Michelle", "Soto")

    //Adicionando alunos a lista
    val listaDeAlunos = mutableListOf<Aluno>()
    listaDeAlunos.add(aluno1)
    listaDeAlunos.add(aluno2)
    listaDeAlunos.add(aluno3)

    //Cadastro de professores
    var professor1 = Professor("Adão", 321)
    var professor2 = Professor("Vitoria",654)
    var professor3 = Professor("João",987)

    //Cadastro de aula
    var aula1 = Aula(materia1, "19h00", "22h30")
    var aula2 = Aula(materia2, "19h00", "22h30")
    var aula3 = Aula(materia3, "19h00", "22h30")

    //Adicionando aulas a lista
    val listaDeAulas = mutableListOf<Aula>()
    listaDeAulas.add(aula1)
    listaDeAulas.add(aula2)
    listaDeAulas.add(aula3)

    //Cadastrando curso
    var curso1 = Curso("Mobile Android", listaDeAulas = listaDeAulas, listaDeAlunos = listaDeAlunos, professor = professor1)
    var curso2 = Curso("Mobile Android", listaDeAulas = listaDeAulas, listaDeAlunos = listaDeAlunos, professor = professor2)
    var curso3 = Curso("Mobile Android", listaDeAulas = listaDeAulas, listaDeAlunos = listaDeAlunos, professor = professor3)

    //Cadastrando turma
    var turma1 = Turma("Turma Teste", curso2)

    //Aluno assiste aula
    aluno1.assistirAulas()

    // Aluno faz lição
    aluno2.fazerLicoesDeCasa()

    // Turma consulta curso
    turma1.consultarCurso(curso1)
}