package java8inaction.app;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  public void shouldAnswerWithTrue() {
    assertThat(true, equalTo(true));
  }
}
