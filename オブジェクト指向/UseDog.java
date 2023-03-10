public class UseDog {
  public static void main(String[] args) {
    Dog pochi = new Dog(); //Dogのpochiインスタンスを生成
    pochi.setName("ポチ"); //フィールドに名前を設定
    pochi.setAge(5);       //フィールドに年齢を設定
    pochi.introduceMyself(); //Dog.javaのintroduceMyselfを呼び出す
  }
}