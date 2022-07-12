package br.com.impacta.laboratorio9.Classes

class Professor: Usuario {
    var presencas: Array<Boolean> = arrayOf()

    constructor(codigo: Long, nome: String, idade: Int, presencas: Array<Boolean>): super(codigo, nome, idade) {
        this.presencas = presencas
    }

    override fun avaliacao(): String {
        var contadorPresencas: Int = 0
        var contadorAusencias: Int = 0

        for (presente in this.presencas) {
            if (presente) contadorPresencas += 1
            else contadorAusencias += 1
        }

        return if (contadorPresencas> contadorAusencias)"O professor ${this.nome} é um bom professor."
        else "O professor ${this.nome} é um professor ausente."
    }
}