public class chapter6{
  public static void main(String[] args) {
    int num1 = 15;
    int num2 =  3;
    int ans = num1 + num2;
System.out.println (ans);  

    int num4 = 100;
    num4++;
System.out.println (num4);/*インクリメント*/
    num4--;
System.out.println (num4);/*デクリメント*/   
     /*確認問題*/
     int val = 2 + 5;  
System.out.println(val);
     val++;
System.out.println(val);     
     
     val *= 5;
System.out.println(val);     

    boolean bool = (val == 50);
System.out.println(bool);

    bool =(val<50)&&(val%10==0);
System.out.println(bool);    
    
  }
}