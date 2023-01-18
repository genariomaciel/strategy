package br.com.leicam.strategy.services.tax;

import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.leicam.strategy.models.Orcamento;
import br.com.leicam.strategy.services.interfaces.ITaxService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaxService {

	private final Map<String, ITaxService> taxStrategies;
	
	public double calcular(Orcamento orcamento) {
        var tax = orcamento.getTax();
        ITaxService strategy = this.taxStrategies.get(tax.getName());
        return strategy.calcular(orcamento);

    }
}
