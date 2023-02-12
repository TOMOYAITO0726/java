public class MaxMinSumAve{
  public static void main(String[] args){
    int[] nums =new int[30];
    for(int i=0; i<nums.length; i++){
      nums[i]=(int)(100*Math.random())+1;
      System.out.println((i+1)+"番目の値=" +nums[i]);
    }
    
    int max =0;
    int min =100;
    int sum =0;
    
    for(int num :nums){
      if(num>max){
        max=num;
      }
      
      if(num<min){
        min=num;
      }
      sum+=num;
    }
    double ave =(double) sum/nums.length;
    
    System.out.println("最大値=" +max);
    System.out.println("最小値=" +min);
    System.out.println("合計値=" +sum);
    System.out.println("平均値=" +ave);

  }
}