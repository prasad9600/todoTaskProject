package com.scaler.todoproject.Service;


import com.scaler.todoproject.DTO.PaymentRequest;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class PaymentService {

    public Charge processPayment(PaymentRequest paymentRequest) throws StripeException {
        Map<String, Object> chargeParams = new HashMap<>();
        chargeParams.put("amount", paymentRequest.getAmount());
        chargeParams.put("currency", paymentRequest.getCurrency());
        chargeParams.put("source", paymentRequest.getToken()); // Stripe token

        return Charge.create(chargeParams);
    }
}
