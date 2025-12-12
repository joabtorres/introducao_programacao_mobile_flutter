void main() {
  Map<String, int> ages = {
    "joab": 20,
    "carlos": 35,
    "debora": 30
  };
  print("Idade do Joab: ${ages['joab']}");
  print("Idade da Debora ${ages['debora']}");

  ages["carla"] = 90;

  print("Idade da Carla: ${ages['carla']}");
}
