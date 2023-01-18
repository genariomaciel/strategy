package br.com.leicam.strategy.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leicam.strategy.enumeration.TaxEmun;
import br.com.leicam.strategy.models.Orcamento;
import br.com.leicam.strategy.services.tax.TaxService;

@RestController
@RequestMapping("/taxes")
public class TaxController {
    private final TaxService service;

    public TaxController(TaxService service) {
        this.service = service;
    }

    @GetMapping
    public List<String> all() {
        List<String> lista = new ArrayList<>();
        lista.add("Valor do ICMS: " +this.service.calcular(new Orcamento(1000, TaxEmun.ICMS)));
        lista.add("Valor do ISS: " +this.service.calcular(new Orcamento(1000, TaxEmun.ISS)));
        lista.add("Valor do PIS/COFINS: " +this.service.calcular(new Orcamento(1000, TaxEmun.PIS_COFINS)));
        return lista;
    }
}