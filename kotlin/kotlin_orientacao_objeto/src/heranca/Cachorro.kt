package heranca

class Cachorro : Animal {
    constructor(nome: String, raca: String, idade: Int, genero: Char) {
        this.nome = nome
        this.raca = raca
        this.idade = idade
        this.genero = genero
    }

    fun latir() {
        println("Latir")
    }
}
