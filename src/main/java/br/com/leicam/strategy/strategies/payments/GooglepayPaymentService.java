package br.com.leicam.strategy.strategies.payments;

import org.springframework.stereotype.Service;

import br.com.leicam.strategy.services.interfaces.IPaymentService;

@Service("Googlepay")
public class GooglepayPaymentService implements IPaymentService{

    @Override
    public String receivePaymet(String amount) {
        return amount + "$ Google pay Payment was successful";
    }
    
}