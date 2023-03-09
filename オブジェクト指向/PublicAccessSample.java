

public class PublicAccessSample {
  public static void main(String[] args){
    Cat tama = new Cat();
    tama.setName("タマ");
    tama.setAge(3);
    
    tama.eat();
    tama.playToy("ボールド");
    tama.introduceMyself();
    tama.printMessage("にゃー");
  }
}