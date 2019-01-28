import java.util.List;
import java.util.ArrayList;

public class Class212 {

  public static void main(String[] args) {
    List<Apple> apples = new ArrayList<>();
    apples.add(new Apple("green", 135));
    apples.add(new Apple("red", 150));
    apples.add(new Apple("red", 156));
    apples.add(new Apple("red", 175));
    apples.add(new Apple("green", 180));

    List<Apple> greenApples = filterApplesByColor(apples, "red");
    System.out.println(greenApples.size());

    List<Apple> greaterThan150 = filterApplesByWeight(apples, 150);
    System.out.println(greaterThan150.size());
  }

  public static List<Apple> filterApplesByColor(List<Apple> invetory, String color) {
    List<Apple> result = new ArrayList<>();
    for(Apple apple: invetory) {
      if(color.equals(apple.getColor())) {
        result.add(apple);
      }
    }
    return result;
  }

  public static List<Apple> filterApplesByWeight(List<Apple> invetory, int weight) {
    List<Apple> result = new ArrayList<>();
    for(Apple apple: invetory) {
      if(apple.getWeight() > weight) {
        result.add(apple);
      }
    }
    return result;
  }
}

