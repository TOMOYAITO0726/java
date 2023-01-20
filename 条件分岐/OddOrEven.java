public class OddOrEven{
  public static void main(String[] args){
    int num = (int)(100*Math.random())+1;
    System.out.println("現在の値: "+num);
    int rem = num % 2;
    if(rem == 0){
      System.out.println("偶数です。");
    }
    else{
      System.out.println("奇数です。");
    }
  }
}