public class SwitchStatement {
  public static void main(String[] args){
    int num = (int) (4*Math.random())+1;
    
    System.out.println("num="+num);
    switch(num){
      case 1:
          System.out.println("優!");
          break;
      case 2:
          System.out.println("良!");
          break;
      case 3:
          System.out.println("可!");
          break;
      case 4:
          System.out.println("不可!");
          break;    
      default:
          System.out.println("出たらおかしいぞ!");
          break;
    }
  }
}