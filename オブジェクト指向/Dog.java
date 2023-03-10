public class Dog {
  String name;
  int age;
  boolean hungry;
  
  void setName(String dogName){
    name = dogName;
  }
  String getName() {
    return name;
  }
  void setAge(int dogAge) {
    age = dogAge;
  }
  int getAge() {
    return age;
  }
  
  void introduceMyself() {
    String n = getName();
    int a = getAge();
    System.out.println("名前は" + n + a +"歳です");
  }
}