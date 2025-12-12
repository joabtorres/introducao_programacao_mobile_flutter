void main(){
  //Nunca vou precisa mudar essa informação
  const String nameSystem = "Urna Eletronica Digal";
  const double version = 1.0;
  print("Sitema: ${nameSystem}");
  print("versão: ${version}");

  final DateTime access = DateTime.now();

  print("Acesso em:: ${access.day}/${access.month}/${access.year}");
  print("Horário: ${access.hour}:${access.minute}:${access.second}");
}