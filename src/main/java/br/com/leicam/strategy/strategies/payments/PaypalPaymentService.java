package br.com.leicam.strategy.strategies.payments;

import org.springframework.stereotype.Service;

import br.com.leicam.strategy.services.interfaces.IPaymentService;

@Service("Paypal")
public class PaypalPaymentService implements IPaymentService{

    @Override
    public String receivePaymet(String amount) {
        return amount + "$ Paypal Payment was successful";
    }
    
}
