package br.com.leicam.strategy.services.strategies;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.leicam.strategy.services.interfaces.ITaxService;
import br.com.leicam.strategy.strategies.taxes.ICMS;

@SpringBootTest
class ICMSTest {
    
    @Test
    void calculate() {
		Double expected = 100.0;
        Double budget = 1000.0;
        ITaxService icms = new ICMS();

		assertEquals(expected, icms.calculate(budget));

    
    }

    @Test
    void calculateBudgetZerado() {
		Double expected = 0.0;
        Double budget = 0.0;
        ITaxService icms = new ICMS();

		assertEquals(expected, icms.calculate(budget));

    }

    @Test
    void calculateBudgetNegativo() {
      Double budget = -0.1;
      ITaxService icms = new ICMS();

      var exception = assertThrows(RuntimeException.class, () -> icms.calculate(budget));

      assertEquals("O valor do orçamento não pode ser negativo.", exception.getMessage());

    }
}
