package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {
  TriangleNumberCalculator Calculator;

  @BeforeEach
  public void setup() {
    Calculator = new TriangleNumberCalculator();
  }

  @Test
  public void triangletest() {
    assertEquals(3, Calculator.add(2, 2));
  }

  @Test
  public void subtriangletest() {
    assertEquals(-3, Calculator.sub(2, 3));
  }

  @Test
  public void subpartial() {
    assertEquals(0, Calculator.sub(1, 1));
  }
  @Test
  public void valuetest()
  {
    assertEquals(3, Calculator.value(2));
  }
}
