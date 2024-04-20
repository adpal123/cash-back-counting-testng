package org.example;
import static org.testng.Assert.assertEquals;

import org.example.CashBackCounting;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


class CashBackCountingTest {

  @Test
  public void shouldCalculateForAmount900AndGetExtra100() {
    CashBackCounting service = new CashBackCounting();
    int expected = 100;
    int actual = service.remain(900);
    assertEquals(actual, expected);
  }

}