package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

    @Test
  public void greetShouldIncludeGreetingMessage1() {
    String someone = "World, Thanks you making me Happy,added new content for maven";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
   @Test
  public void greetShouldIncludeGreetingMessag1e11() {
    String someone = "World, Thanks you making me Happy, polling job";
     assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

}
