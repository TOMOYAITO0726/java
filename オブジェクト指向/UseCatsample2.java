public class UseCatsample2{
  public static void main(String[] age){
    Cat tama = new Cat();
    Cat mike = new Cat();
    
    tama.setName("タマ");
    tama.setAge(3);
    mike.setName("みけ");
    mike.setAge(2);
    tama.introductionMyself();
    mike.introductionMyself();
  }
}