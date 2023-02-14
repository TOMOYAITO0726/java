public class ArrayOperations{
  public int getSumArray(int[] array){
    int sum = 0;
    for(int element : array){
      sum+= element;
    }
    return sum;
  }
}