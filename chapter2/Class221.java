import java.util.List;
import java.util.ArrayList;

public class Class221 {

  public static void main(String[] args) {
    List<Apple> inventory = new ArrayList<>();
    inventory.add(new Apple("green", 145));
    inventory.add(new Apple("red", 150));
    inventory.add(new Apple("green", 160));
    inventory.add(new Apple("green", 170));
    inventory.add(new Apple("red", 160));
    inventory.add(new Apple("green", 100));

    List<Apple> filteredApples = filterApples(inventory, new AppleGreenColorPredicate());
    System.out.println(filteredApples.size());
    
    filteredApples = filterApples(inventory, new AppleHeavyWeightPredicate());
    System.out.println(filteredApples.size());

    filteredApples = filterApples(inventory, new AppleRedAndHeavyPredicate());
    System.out.println(filteredApples.size());

    prettyPrintApple(inventory, new AppleFancyFormatter());
    prettyPrintApple(inventory, new AppleSimpleFormatter());
  }

  private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
    List<Apple> result = new ArrayList<>();
    for(Apple apple: inventory) {
      if(predicate.test(apple)) {
        result.add(apple);
      }
    }
    return result;
  }

  private static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
    for(Apple apple: inventory) {
      System.out.println(formatter.format(apple));
    }
  }
}

