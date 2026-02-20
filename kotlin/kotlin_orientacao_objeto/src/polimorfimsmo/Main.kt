package polimorfimsmo

fun main() {
    //Classe Gato
    val thor = Gato();
    thor.comunicar()

    //Classe Cachorro
    val mel = Cachorro()
    mel.comunicar()

    //Classe Animal
    val churrasco = Animal()
    churrasco.comunicar()
}

