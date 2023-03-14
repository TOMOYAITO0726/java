public class Dog {
  private String name; //フィールドはprivate
  private int age;
  private boolean hungry;
  
  private void printMessage(String message) {
    System.out.println(name +">" + message);
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