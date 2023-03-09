public class Cat{
  String name;  //nameフィールドを追加
  int age;      //ageフィールドを追加
  boolean hungry;  //hungryフィールドを追加
  
  public void eat(){
    System.out.println(name + ">ごはんを食べるよ！おいしいにゃー");
    System.out.println(name + ">お腹が一杯になったにゃー");
    hungry =false;
  }
  
  public boolean isHungry() {
    return true;
  }
  
  public void playToy(String toy){
    System.out.println(name+">" + toy + "で遊ぶよ。楽しいにゃー");
    System.out.println(name+">遊んでお腹が減ったにゃー");
    hungry = true;
  }
  
  public void setName(String catName){ //nameフィールドのセッターを追加
    name = catName;
  }
  
  public String getName(){ //nameフィールドのゲッターを追加
    return name;
  }
  
  public void setAge(int catAge){ //ageフィールドのセッターを追加
    age = catAge;
  }
  
  public int getAge(){ //ageフィールドのゲッターを
    return age;
  }
  public void introductionMyself(){
    String n = getName();
    int a = getAge();
    System.out.println("名前"+ n +"です"+a+"歳です");
  }
}