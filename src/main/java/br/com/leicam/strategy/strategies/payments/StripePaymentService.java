package br.com.leicam.strategy.strategies.payments;

import org.springframework.stereotype.Service;

import br.com.leicam.strategy.services.interfaces.IPaymentService;

@Service("Stripe")
public class StripePaymentService implements IPaymentService{

    @Override
    public String receivePaymet(String amount) {
        return amount + "$ Stripe Payment was successful";
    }
    
}
