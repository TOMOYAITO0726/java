public class DoWhileStatement{
  public static void main(String[] args){
    int ans =0;
    int i =1;
    do{
      ans += i;
      i++;
    }
    while(i<=100);
    System.out.println("答え:"+ans);
    System.out.println("ループ終了後のiの値:" +i);
  }
}