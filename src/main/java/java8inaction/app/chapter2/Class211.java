package java8inaction.app.chapter2;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

public class Class211 {

  public static void main(String[] args) {
    List<Apple> apples = new ArrayList<>();
    apples.add(new Apple("green", 140));
    apples.add(new Apple("red", 130));
    apples.add(new Apple("red", 120));
    apples.add(new Apple("green", 90));

    List<Apple> greenApples = filterGreenApples(apples);
    out.println(greenApples.size());
  }

  public static List<Apple> filterGreenApples(List<Apple> invetory) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : invetory) {
      if ("green".equals(apple.color())) {
        result.add(apple);
      }
    }
    return result;
  }
}
