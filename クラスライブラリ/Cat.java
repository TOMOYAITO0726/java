public final class Cat extends Animal implements Pet {
  public Cat(String name, int age) {
    //setName(name);
    //setAge(age);
    super(name, age);
    System.out.println("コンストラクター:Cat(String name, int age)が呼び出された");
    System.out.println("  引数:name=" + name +", age=" + age);
  }
  
  @Override
  public void eat() {
    eat("ご飯");
  }
  
  @Override
  public void eat(String food) {
    printMessage(food + "を食べるよ！おいしいにゃー");
    printMessage("お腹が一杯になったにゃー");
    setHungry(false);
  }
  
  @Override
  public void playToy(String toy) {
    printMessage(toy + "で遊ぶよ。楽しいにゃー");
    printMessage("遊んでお腹が減ったにゃー");
    setHungry(true);
  }
  
  @Override
  public void playToy() {
    playToy("おもちゃ");
  }
  
  @Override
  public void introduceMyself() {
    
    super.introduceMyself(); //AnimalクラスのintroduceMyselfメソッドを呼び出す
                             //super.を使うことでCatクラスのインスタンスを生成する
                              
    boolean h = isHungry();
    if(h == true) {
       printMessage("お腹がすいているにゃー！");
    } else {
       printMessage("お腹はすいていないにゃー！");
    }
  }
} 
