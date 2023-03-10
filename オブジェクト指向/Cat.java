

public class Cat{
  private String name;  //nameフィールドを追加
  private int age;      //ageフィールドを追加
  private boolean hungry;  //hungryフィールドを追加
  
  public Cat() {
    System.out.println("コンストラクター:Cat()が呼び出された");
    this.name = "まだない";
    this.age = 0;
  }
  
  public Cat(String name, int age) {
    System.out.println("コンストラクター:Cat(String name, int age)が呼び出された");
    this.name = name;
    this.age = age;
  }
  
  public Cat(String name) {
    this(name,0);
    System.out.println("コンストラクター:Cat(String name)が呼び出された");
  }
  private void printMessage(String message){
    System.out.println(name + ">" + message);
  }
  
  public void eat(){
    printMessage( "ごはんを食べるよ！おいしいにゃー");
    printMessage( ">お腹が一杯になったにゃー");
    hungry =false;
  }
  
  public void eat(String food) {
    printMessage(food+"を食べるよ！おいしいにゃー");
    printMessage("お腹が一杯になったにゃー");
    hungry = false;
  }
  public boolean isHungry() {
    return true;
  }
  
  public void playToy(String toy){
    printMessage( "おもちゃで遊ぶよ。楽しいにゃー");
    printMessage("遊んでお腹が減ったにゃー");
    hungry = true;
  }
  
  public void playToy(){
    printMessage("おもちゃで遊ぶよ。楽しいにゃー");
    printMessage("遊んでお腹が減ったにゃー");
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
  public void introduceMyself(){
    printMessage("名前は"+ getName() +"です"+ getAge() +"歳です");
  }
}