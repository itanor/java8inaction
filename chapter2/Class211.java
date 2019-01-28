import java.util.List;
import java.util.ArrayList;

public class Class211 {

  public static void main(String[] args) {
    List<Apple> apples = new ArrayList<>();
    apples.add(new Apple("green"));
    apples.add(new Apple("red"));
    apples.add(new Apple("red"));
    apples.add(new Apple("green"));

    List<Apple> greenApples = filterGreenApples(apples);
    System.out.println(greenApples.size());
  }

  public static List<Apple> filterGreenApples(List<Apple> invetory) {
    List<Apple> result = new ArrayList<>();
    for(Apple apple: invetory) {
      if("green".equals(apple.getColor())) {
        result.add(apple);
      }
    }
    return result;
  }
}

