public interface Pet { //①インターフェースを定義
  public void eat(); //②抽象メソッドを定義
  public void eat(String food);
  public void playToy();
  public void playToy(String toy);
  
 public String getName();  
 public void setName(String name);
 public int getAge();
 public void setAge(int age);
 public boolean isHungry();
 public void setHungry(boolean hungry);
 public void introduceMyself();
}