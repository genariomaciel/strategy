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

    @GetMapping()
    public List<String> instrucoes() { 
        List<String> lista = new ArrayList<>();
        lista.add("http://localhost:8080/taxes");
        lista.add("http://localhost:8080/taxes/all");
        lista.add("http://localhost:8080/taxes/icms");
        lista.add("http://localhost:8080/taxes/iss");
        lista.add("http://localhost:8080/taxes/pis/cofins");
        return lista;
    }

    @GetMapping("/all")
    public List<Budget> all() {
        List<Budget> lista = new ArrayList<>();
        lista.add(this.service.calculate(new Budget(1000, TaxEmun.ICMS)));
        lista.add(this.service.calculate(new Budget(1000, TaxEmun.ISS)));
        lista.add(this.service.calculate(new Budget(1000, TaxEmun.PIS_COFINS)));
        lista.add(this.service.calculate(new Budget(1500, TaxEmun.ICMS)));
        return lista;
    }
    @GetMapping("/icms")
    public Budget icms() {
        return this.service.calculate(new Budget(1000, TaxEmun.ICMS));
    }
    @GetMapping("/iss")
    public Budget iss() {
        return this.service.calculate(new Budget(1000, TaxEmun.ISS));
    }
    @GetMapping("/pis/cofins")
    public Budget pis() {
        return this.service.calculate(new Budget(1000, TaxEmun.PIS_COFINS));
    }
}