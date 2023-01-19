public class IfElseStatement2{
  public static void main(String[] args){
    int num = (int) (100*Math.random()) + 1;
    System.out.println("現在の値:"+num);
    boolean cond =(num<=40);
    if (cond){
      System.out.println("数値は40以下です。");
    }
    else{
      System.out.println("数値は40より大きいです。");
    }
    System.out.println("処理終了！");
  }
}