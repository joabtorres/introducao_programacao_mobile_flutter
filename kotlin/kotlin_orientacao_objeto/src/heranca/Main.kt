package heranca

fun main() {
    //Classe Gato
    val thor = Gato()
    thor.nome = "Thor"
    thor.raca = "Persa"
    thor.idade = 4
    thor.miar()
    thor.showAnimal()
    //Classe Cachorro
    val mel = Cachorro("Mel", "Chow-Chow", 7, 'F')
    mel.latir()
    mel.showAnimal()

    //Classe Animal
    val churrasco = Animal()
    churrasco.nome = "Churrasco"
    churrasco.raca = "Nelore"
    churrasco.idade = 10
    churrasco.genero = 'M'
    churrasco.showAnimal()
}