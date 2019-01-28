public class AppleSimpleFormatter implements AppleFormatter {

  public String format(Apple apple) {
    return "An apple of " + apple.getWeight() + "g";
  }
}

