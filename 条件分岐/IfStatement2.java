public class IfStatement2{
  public static void main(String[] args){
    int num=(int)(100*Math.random())+1;
    System.out.println("現在の値: " + num);
    if(num<= 40){
      System.out.println("数値は40以下です。");
    }
    System.out.println("処理終了！");
  }
}