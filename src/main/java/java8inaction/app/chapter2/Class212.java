package java8inaction.app.chapter2;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

public class Class212 {

  public static void main(String[] args) {
    List<Apple> apples = new ArrayList<>();
    apples.add(new Apple("green", 135));
    apples.add(new Apple("red", 150));
    apples.add(new Apple("red", 156));
    apples.add(new Apple("red", 175));
    apples.add(new Apple("green", 180));

    List<Apple> greenApples = filterApplesByColor(apples, "red");
    out.println(greenApples.size());

    List<Apple> greaterThan150 = filterApplesByWeight(apples, 150);
    out.println(greaterThan150.size());
  }

  public static List<Apple> filterApplesByColor(List<Apple> invetory, String color) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : invetory) {
      if (color.equals(apple.color())) {
        result.add(apple);
      }
    }
    return result;
  }

  public static List<Apple> filterApplesByWeight(List<Apple> invetory, int weight) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : invetory) {
      if (apple.weight() > weight) {
        result.add(apple);
      }
    }
    return result;
  }
}
