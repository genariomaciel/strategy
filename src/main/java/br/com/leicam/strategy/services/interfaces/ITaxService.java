package br.com.leicam.strategy.services.interfaces;

import br.com.leicam.strategy.models.Orcamento;

public interface ITaxService {
    double calcular(Orcamento orcamento);
}
