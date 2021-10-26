package java8inaction.app.chapter2;

public class AppleSimpleFormatter implements AppleFormatter {

  @Override
  public String format(Apple apple) {
    return "An apple of " + apple.weight() + "g";
  }
}
