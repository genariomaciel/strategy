package br.com.leicam.strategy.models;

import br.com.leicam.strategy.enumeration.TaxEmun;
import lombok.Getter;

@Getter
public class Orcamento {
	
	private final double valor;
	private final TaxEmun tax;
	
	public Orcamento(double valor, TaxEmun tax) {
		this.valor = valor;
		this.tax = tax;
	}
	
}
