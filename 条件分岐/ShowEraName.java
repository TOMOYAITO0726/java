public class ShowEraName {
  public static void main(String[] args){
    int year = (int)(100*Math.random()) +1901;
    if(year<1912){
      System.out.println(year+"年は明治です。");
    }
    else if(year<1926){
      System.out.println(year+"年は大正です。");
    }
    else if(year<1989){
      System.out.println(year+"年は昭和です。");
    }
    else {
      System.out.println(year+"年は平成です。");

    }
  }
}