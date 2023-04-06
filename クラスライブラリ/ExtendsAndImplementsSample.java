public class ExtendsAndImplementsSample {
  public static void main(String[] args) {
    Pet tama = new Cat("タマ", 3); //Catクラスのインスタンスを代入、コンストラクターの呼び出し
    tama.eat();
    tama.introduceMyself();
   
    
    Pet pochi = new Dog("ポチ", 5); //Dogクラスのインスタンスを代入、コンストラクターの呼び出し
    pochi.eat();
    pochi.introduceMyself();
    
  }
}