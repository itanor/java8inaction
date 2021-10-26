package java8inaction.app.chapter2;

public class AppleFancyFormatter implements AppleFormatter {

  @Override
  public String format(Apple apple) {
    String description = apple.weight() > 150 ? "heavy" : "light";
    return "A " + description + " " + apple.color() + " apple.";
  }
}
