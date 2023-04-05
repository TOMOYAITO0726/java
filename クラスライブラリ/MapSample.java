import java.util.HashMap;
import java.util.Map;

public class MapSample {
  public static void main(String[] args) {
    Map<String, Integer> animalsMap = new HashMap<>();
  
    animalsMap.put("犬", 1);
    animalsMap.put("猫", 2);
    animalsMap.put("猿", 3);
    
    
    System.out.println("犬:" + animalsMap.get("犬"));
    System.out.println("猫:" + animalsMap.get("猫"));
    System.out.println("猿:" + animalsMap.get("猿"));
  }
}