package br.com.leicam.strategy.strategies.taxes;

import org.springframework.stereotype.Service;

import br.com.leicam.strategy.services.interfaces.ITaxService;

@Service("ISS")
public class ISS  implements ITaxService{

	@Override
	public double calculate(double budget) {
		if (budget < 0.0)
			throw new RuntimeException("O valor do orçamento não pode ser negativo.");		
		return budget * 0.06;
	}
}
