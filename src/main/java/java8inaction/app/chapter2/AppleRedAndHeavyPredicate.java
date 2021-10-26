package java8inaction.app.chapter2;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

  @Override
  public boolean test(Apple apple) {
    return "red".equals(apple.color()) && apple.weight() > 150;
  }
}
