import java.util.ArrayList;
import java.util.List;

public class ListLoopSample {
  public static void main(String[] args) {
    List<String> animalsList = new ArrayList<>();

    animalsList.add("犬");
    animalsList.add("猫");
    animalsList.add("猿");
    
    for (String animals : animalsList) { //リストから要素を取り出す
      System.out.println(animals);
    }
  }
}