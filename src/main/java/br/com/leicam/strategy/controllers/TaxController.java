package br.com.leicam.strategy.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leicam.strategy.enumeration.TaxEmun;
import br.com.leicam.strategy.models.Budget;
import br.com.leicam.strategy.services.tax.TaxService;

@RestController
@RequestMapping("/taxes")
public class TaxController {
    private final TaxService service;

    public TaxController(TaxService service) {
        this.service = service;
    }

    @GetMapping
    public List<Budget> all() {
        List<Budget> lista = new ArrayList<>();
        lista.add(this.service.calculate(new Budget(1000, TaxEmun.ICMS)));
        lista.add(this.service.calculate(new Budget(1000, TaxEmun.ISS)));
        lista.add(this.service.calculate(new Budget(1000, TaxEmun.PIS_COFINS)));
        lista.add(this.service.calculate(new Budget(1500, TaxEmun.ICMS)));
        return lista;
    }
}