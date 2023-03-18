public class Dog {
  private String name; //nameフィールド
  private int age;     //ageフィールド
  public Dog(String name, int age) {
    System.out.println(name); //nameは、引数で渡されたローカル変数nameを示す
    System.out.println(this.name); //this.nameは、nameフィールドを示す
    this.name = name; //引数で受けたローカル変数nameをnameフィールドに代入
    this.age = age;  //引数のローカル変数ageをageフィールドに代入
  }
  
  private void printMessage(String message) {
    System.out.println( message );
  }
  
  public void eat() {
    printMessage("ご飯を食べるよ");
  }
  
  public void eat(String food) {
    printMessage(food + "を食べるよ");
  }
  
  public void  playToy(String toy) {
    printMessage(toy + "で遊ぶよ");
  }
  
  public void playToy() {
    printMessage("おもちゃで遊ぶよ");
  }
  
}
