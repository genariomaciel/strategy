package br.com.leicam.strategy.services.tax;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.leicam.strategy.enumeration.TaxEmun;
import br.com.leicam.strategy.models.Budget;
import br.com.leicam.strategy.services.interfaces.ITaxService;
import br.com.leicam.strategy.strategies.taxes.ICMS;

@SpringBootTest
class TaxServiceTests {

	Map<String, ITaxService> taxStrategies = new HashMap<>();
	TaxService service;

	@BeforeEach
    void init() {
		this.taxStrategies.put("ICMS", new ICMS());
		this.service = new TaxService(taxStrategies);
    }
	
    @Test
    void calculateTaxAmount() {
		
		var budget = new Budget(1000, TaxEmun.ICMS);

		assertEquals(service.calculate(budget).getTax().getValue(), 100.0);

    }

}