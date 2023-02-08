public class BreakAndContinue{
  public static void main(String[] args){
    int[] numes = new int[5];
    int[] denomis = new int[5];
    for(int i=0; i<5; i++){
      numes[i] =(int)(10*Math.random());
      denomis[i] =(int)(10*Math.random());
    }
    
    for(int denomi : denomis){
      System.out.println("--分母の値:"+denomi);
      if(denomi ==0){
        System.out.println("0で割り算はできません。処理を中止します。");
        break;
      }
      for(int nume :numes){
        System.out.println("分子の値: " + nume);
        if(nume==0){
        System.out.println("\t分子0は答え0ですので処理を飛ばします。");
        continue;
      }
      double ans =(double)nume/denomi;
      System.out.println("\t割り算の答え:"+ans);
      }
    }
  }
}