package br.com.leicam.strategy.strategies.taxes;

import org.springframework.stereotype.Service;

import br.com.leicam.strategy.models.Orcamento;
import br.com.leicam.strategy.services.interfaces.ITaxService;

@Service("ISS")
public class ISS  implements ITaxService{

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
