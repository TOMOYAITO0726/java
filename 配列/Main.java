public class Main{
  public static void main(String[] args){
    int plusTotal =0;
    int minusTotal =0;
    int number[]={1,2,3,4,5};
    for(int score : number){
      plusTotal += score;
      minusTotal -= score;
    }
    System.out.println("配列内を全部プラスすると"+plusTotal);
    System.out.println("配列内を全部マイナスすると"+minusTotal);
  }
}