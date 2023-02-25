public class Cat{
  //メソッドを定義
  void eat(){
    System.out.println("ご飯を食べるよ！おいしいにゃー");
  }
  
  boolean isHungry() { //メソッドを追加
    return true; //戻り値trueを返す
  }
  
  void playToy(String toy) { //playToyメソッドを追加
    System.out.println(toy + "で遊ぶよ。楽しいにゃー"); //文字列を出力
  }
}