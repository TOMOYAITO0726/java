public class NestedIf{
  public static void main(String[] args){
    int num = (int)(100*Math.random())+1;
    if (num % 2 == 0) {
      System.out.println("num=" + num +"は２の倍数です。");
      if(num % 3 == 0){
        System.out.println("しかも、３の倍数です。");
      }
    }
    else{
        System.out.println("残念ながらnum="+num+"は２の倍数ではありません。");
    }
  }
}