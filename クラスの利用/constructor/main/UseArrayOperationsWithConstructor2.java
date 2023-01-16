package constructor.main;
public class UseArrayOperationsWithConstructor2{
  public static void main(String[] args){
    int[] list1 = {4,5,84,7,1,15};
    int[] list2 = {54,47,5,358,2};
    int[] list3 = {5,87,8,11,41};
    
    ArrayOperationsWithConstructor arrayOpe1 = new ArrayOperationsWithConstructor(list1);
    ArrayOperationsWithConstructor arrayOpe2 = new ArrayOperationsWithConstructor(list2);
    ArrayOperationsWithConstructor arrayOpe3 = new ArrayOperationsWithConstructor(list3);
    
    int sum1 = arrayOpe1.getSumArray();
    int sum2 = arrayOpe2.getSumArray();
    int sum3 = arrayOpe3.getSumArray();

    double ave1 = arrayOpe1.getAverage();
    double ave2 = arrayOpe2.getAverage();
    double ave3 = arrayOpe3.getAverage();
    
    System.out.println("配列1内の合計: " + sum1 +" 平均: "+ ave1);
    System.out.println("配列2内の合計: " + sum2 +" 平均: "+ ave2);
    System.out.println("配列3内の合計: " + sum3 +" 平均: "+ ave3);
  }
}