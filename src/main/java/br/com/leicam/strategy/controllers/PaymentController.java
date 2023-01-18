package br.com.leicam.strategy.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leicam.strategy.services.payment.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @GetMapping
    public List<String> all() {
        List<String> lista = new ArrayList<>();
        lista.add(this.service.receivePayment("100.00", "Paypal"));
        lista.add(this.service.receivePayment("100.00", "Stripe"));
        lista.add(this.service.receivePayment("100.00", "Applepay"));
        lista.add(this.service.receivePayment("100.00", "Googlepay"));
        return lista;
    }
}
