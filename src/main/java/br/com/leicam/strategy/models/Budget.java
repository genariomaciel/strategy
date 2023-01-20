package br.com.leicam.strategy.models;

import br.com.leicam.strategy.enumeration.TaxEmun;
import lombok.Getter;

@Getter
public class Budget {
	
	private final double value;
	private final Tax tax;
	
	public Budget(double value, TaxEmun tax) {
		this.value = value;
		this.tax = new Tax(tax.getId(), tax.getName(), 0L);
	}
	
}
