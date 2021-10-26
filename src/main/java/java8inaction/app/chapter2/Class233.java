package java8inaction.app.chapter2;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

public class Class233 {

  public static void main(String[] args) {
    List<Apple> inventory = new ArrayList<>();
    inventory.add(new Apple("green", 120));
    inventory.add(new Apple("red", 160));
    inventory.add(new Apple("red", 1750));

    List<Apple> filtered = filterApples(inventory, (Apple apple) -> "red".equals(apple.color()));
    out.println(filtered.size());
  }

  private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (predicate.test(apple)) {
        result.add(apple);
      }
    }
    return result;
  }
}
