package construtores.multiplos

             //Primário
class Pessoa (var nome: String) {
    var idade: Int = 0
    var genero: Char = 'M'

    //Secundário
    constructor(nome: String, idade: Int) : this(nome) {
        this.idade = idade
    }

    //Terciário
    constructor(nome: String, idade: Int, genero: Char) : this(nome, idade) {
        this.genero = genero
    }
}
