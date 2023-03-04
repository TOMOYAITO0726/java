

public class Cat{
  String name;  //nameフィールドを追加
  int age;      //ageフィールドを追加
  boolean hungry;  //hungryフィールドを追加
  
  void eat(){
    System.out.println(name + ">ごはんを食べるよ！おいしいにゃー");
    System.out.println(name + ">お腹が一杯になったにゃー");
    hungry =false;
  }
  
  boolean isHungry() {
    return true;
  }
  
  void playToy(String toy){
    System.out.println(name+">" + toy + "で遊ぶよ。楽しいにゃー");
    System.out.println(name+">遊んでお腹が減ったにゃー");
    hungry = true;
  }
  
  void setName(String catName){ //nameフィールドのセッターを追加
    name = catName;
  }
  
  String getName(){ //nameフィールドのゲッターを追加
    return name;
  }
  
  void setAge(int catAge){ //ageフィールドのセッターを追加
    age = catAge;
  }
  
  int getAge(){ //ageフィールドのゲッターを
    return age;
  }
  void introductionMyself(){
    String n = getName();
    int a = getAge();
    System.out.println("名前"+ n +"です"+a+"歳です");
  }
}