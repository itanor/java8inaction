package java8inaction.app.chapter2;

public class Apple {

  private String color;
  private int weight;

  public Apple(String color, int weight) {
    this.color = color;
    this.weight = weight;
  }

  public String color() {
    return color;
  }

  public int weight() {
    return weight;
  }
}
