package br.com.leicam.strategy.services.tax;

import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.leicam.strategy.models.Budget;
import br.com.leicam.strategy.services.interfaces.ITaxService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaxService {

	private final Map<String, ITaxService> taxStrategies;
	
	public Budget calculate(Budget budget) {
        var tax = budget.getTax();
        ITaxService strategy = this.taxStrategies.get(tax.getName());
        tax.setValue(strategy.calculate(budget.getValue()));
        return budget;

    }
}
