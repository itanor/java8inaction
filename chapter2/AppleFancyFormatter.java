public class AppleFancyFormatter implements AppleFormatter {

  public String format(Apple apple) {
    String description = apple.getWeight() > 150 ? "heavy" : "light";
    return "A " + description + " " + apple.getColor() + " apple.";
  }
}

