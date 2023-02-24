public class Ifelsesample{
  public static void main(String[] args){
    int maxTemperture = 15;
    
    if(maxTemperture>=35){
      System.out.println("今日は猛暑日です。");
    } else if(maxTemperture>=30){
      System.out.println("今日は真夏日です。");
    } else if(maxTemperture>=25){
      System.out.println("今日は夏日です。");
    } else{
      System.out.println("今日は猛暑・真夏日・夏日ではありません。");
    }
  }
}