void main(){
  String name = "joab Torres Alencar";
  double height = 1.75;
  int age = 90;
  bool isTeacher = true;
  print("Nome: ${name.toUpperCase()}");
  print("Altura: ${height} cm, minha altura é negativa? ${height.isNegative}");
  print("Idade: ${age} anos, idade informada? ${!age.isNaN}");
  print("Sou professor: ${isTeacher}");
}