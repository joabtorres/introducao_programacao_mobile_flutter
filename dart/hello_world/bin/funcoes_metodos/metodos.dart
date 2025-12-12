//exibi informações completa do aluno
void showStudent(Map student){
  print("Aluno: ${student['name']}");
  print("Matricula: ${student['enroll']}");
  print("Curso: ${student['curse']}");
  print("Turma: ${student['class']}");
}
//Verifica se exite determina turma
void classValidate(String search){
  List<String> turmas = ["TADS11", "TADS12", "TADS15", "TADS14", "TADS13"];
  turmas.forEach((turma) {
      if(turma == search){
        print('Turma Encontrada\n');
      }
  });
}

void main(){
  final Map<String, String> student = {
    "enroll": "2015790058",
    "name": "Joab Torres Alencar",
    "curse" : "Tecnologo em Análise e Desenvolvimento de Sistema",
    "class": "TADS15",
  };

  classValidate(student['class'].toString());

  showStudent(student);
}


