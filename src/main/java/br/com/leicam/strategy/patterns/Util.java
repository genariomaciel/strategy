package br.com.leicam.strategy.patterns;

import java.text.DecimalFormat;

public class Util {
	public static double round(double valor) {
		return round(valor, 2);
	}
	public static double round(double valor, int decimais) {
		String format = "#,##0." + "0".repeat(decimais);
		String novoValor = new DecimalFormat(format).format(valor).replace(",", ".");
		return Double.valueOf(novoValor);
	}
}
