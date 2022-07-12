package br.com.impacta.laboratorio9.Classes

class Aluno : Usuario {
    var notas: Array<Double> = arrayOf()

    constructor(codigo: Long, nome: String, idade: Int, notas: Array<Double>) : super(
        codigo,
        nome,
        idade
    ) {
        this.notas = notas
    }

    override fun avaliacao(): String {
        var acumulador: Double = 0.0

        for (nota in this.notas) {
            acumulador += nota
        }

        var media = acumulador / this.notas.size

        return if (media >= 7.0) "O aluno ${this.nome} é um bom aluno"
        else "O aluno ${this.nome} é um mal aluno"
    }
}