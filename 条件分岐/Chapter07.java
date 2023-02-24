public class Chapter07{
  public static void main(String[] args){
    for (int num =1; num<=50; ++num){
      if(num % 15 == 0){
        System.out.println("わん！にゃ～");
      } else if(num % 3 == 0){
        System.out.println("わん");
      } else if(num % 5 == 0){
        System.out.println("にゃ～");
      } else{
        System.out.println(num);
      }
    }
  }
}