package br.com.leicam.strategy.services.payment;

import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.leicam.strategy.services.interfaces.IPaymentService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentService {
    //# Inclusão das estrategias de pagamento
    private final Map<String, IPaymentService> paymentMethodMap;

    public String receivePayment(String amount, String paymentMethod) {
        IPaymentService payment = this.paymentMethodMap.get(paymentMethod);
        return payment.receivePaymet(amount);

    }
    
}
