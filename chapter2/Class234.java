import java.util.List;
import java.util.ArrayList;

public class Class234 {

  public static void main(String[] args) {
    List<Apple> inventory = new ArrayList<>();
    inventory.add(new Apple("green", 120));
    inventory.add(new Apple("red", 170));

    List<Apple> filtered = filter(inventory, 
        (Apple apple) -> "green".equals(apple.getColor()) && apple.getWeight() > 100);

    System.out.println(filtered.size());

    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(60);
    numbers.add(100);

    List<Integer> integers = filter(numbers, (Integer i) -> i > 50);
    System.out.println(integers.size());
  }

  private static <T> List<T> filter(List<T> list, Predicate<T> p) {
    List<T> result = new ArrayList<>();
    for(T e: list) {
      if(p.test(e)) {
        result.add(e);
      }
    }
    return result;
  }
}

