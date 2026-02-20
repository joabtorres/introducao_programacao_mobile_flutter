package sintaxe

fun validarTurma(buscar: String){
    val turmas = listOf<String>("TADS11", "TADS12", "TADS15", "TADS16", "TADS14")
    turmas.forEach { turma ->
        if(turma.equals(buscar)){
            println("Turma encontrada!")
            return
        }
    }
    println("Turma não encontrada")
}

fun main() {
    validarTurma("TADS12")
}
