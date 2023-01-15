public class ArrayOperationsWithField{
  public int _sum;
  public int _arrayLength;
  
  public int getSumArray(int[] array){
    _arrayLength = array.length;
    int sum =0;
    for(int element : array){
      sum += element;
    }
    _sum = sum;
    return sum;
  }
  
  public double getAverage(){
    double average = (double) _sum / _arrayLength;
    return average;
  }
}