public class DogOverload {
  public static void main(String[] args) {
      Dog pochi = new Dog();
      pochi.eat();  //Dogクラスのeat()メソッドを呼び出す
      pochi.eat("高級なドッグフード");  //Dogクラスのeat(String food)メソッドを呼び出す
      pochi.playToy();  //DogクラスのplayToy()メソッドを呼び出す
      pochi.playToy("ボール");  //DogクラスのplayToy(String Toy)メソッドを呼び出す
  }
}
public Dog(String n, int a) {
  //処理
}