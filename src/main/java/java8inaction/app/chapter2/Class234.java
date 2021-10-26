package java8inaction.app.chapter2;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

public class Class234 {

  public static void main(String[] args) {
    List<Apple> inventory = new ArrayList<>();
    inventory.add(new Apple("green", 120));
    inventory.add(new Apple("red", 170));

    Predicate<Apple> applePredicate = apple -> "green".equals(apple.color()) && apple.weight() > 100;
    List<Apple> filtered = filter(inventory, applePredicate);

    out.println(filtered.size());

    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(60);
    numbers.add(100);

    List<Integer> integers = filter(numbers, i -> i > 50);
    out.println(integers.size());
  }

  private static <T> List<T> filter(List<T> list, Predicate<T> p) {
    List<T> result = new ArrayList<>();
    for (T e : list) {
      if (p.test(e)) {
        result.add(e);
      }
    }
    return result;
  }
}
