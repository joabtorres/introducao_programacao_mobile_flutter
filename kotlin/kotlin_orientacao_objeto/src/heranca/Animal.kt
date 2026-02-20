package heranca

open class Animal {
    lateinit var nome: String
    lateinit var raca: String
    var idade: Int = 0
    var genero: Char = 'M'

    fun showAnimal(){
        println("Instância do objeto: ${this}")
        println("Raça: ${this.raca}")
        println("Nome: ${this.nome}")
        println("Idade: ${this.idade}")
        println("Genero: ${this.genero}")
    }
}