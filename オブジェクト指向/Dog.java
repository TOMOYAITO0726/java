public class Dog {
  String name; //名前を表すnameフィールド
  int age; //年齢を表すageフィールド
 
  void setName(String dogName){ //nameフィールドののセッター
    name = dogName;
  }
  String getName() { //nameフィールドのゲッター
    return name;
  }
  void setAge(int dogAge) { //ageフィールドのセッター
    age = dogAge;
  }
  int getAge() { //ageフィールドのゲッター
    return age;
  }
  
  void introduceMyself() { 
    String n = getName(); //getNameメソッドを呼び出す
    int a = getAge();     //getAgeメソッドを呼び出す
    System.out.println("名前は" + n + a +"歳です"); //取得した値を表示
  }
}