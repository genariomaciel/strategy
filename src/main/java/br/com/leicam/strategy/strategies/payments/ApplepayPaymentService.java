package br.com.leicam.strategy.strategies.payments;

import org.springframework.stereotype.Service;

import br.com.leicam.strategy.services.interfaces.IPaymentService;

@Service("Applepay")
public class ApplepayPaymentService implements IPaymentService{

    @Override
    public String receivePaymet(String amount) {
        return amount + "$ Apple pay Payment was successful";
    }
    
}
