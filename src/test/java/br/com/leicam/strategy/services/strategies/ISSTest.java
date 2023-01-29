package br.com.leicam.strategy.services.strategies;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.leicam.strategy.services.interfaces.ITaxService;
import br.com.leicam.strategy.strategies.taxes.ISS;

@SpringBootTest
class ISSTest {
    
  private ITaxService strategy;

  @BeforeEach
  void init() {
    this.strategy = new ISS();
  }

  @Test
  void calculate() {
    Double expected = 60.0;
    Double budget = 1000.0;

    assertEquals(expected, this.strategy.calculate(budget));
  }

  @Test
  void calculateBudgetZerado() {
    Double expected = 0.0;
    Double budget = 0.0;

    assertEquals(expected, this.strategy.calculate(budget));

  }
  
  @Test
  void calculateBudgetNegativo() {
    Double budget = -0.1;

    var exception = assertThrows(RuntimeException.class, () -> this.strategy.calculate(budget));

    assertEquals("O valor do orçamento não pode ser negativo.", exception.getMessage());

  }

}
