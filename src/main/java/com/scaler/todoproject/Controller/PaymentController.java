package com.scaler.todoproject.Controller;


import com.scaler.todoproject.DTO.ChargeDTO;
import com.scaler.todoproject.DTO.PaymentRequest;
import com.scaler.todoproject.Service.PaymentService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments/charge")
    public ResponseEntity<?> charge(@RequestBody PaymentRequest request) {
        try {
            Charge charge = paymentService.processPayment(request);
            return ResponseEntity.ok(new ChargeDTO(charge));
        } catch (StripeException e) {
            return ResponseEntity.badRequest().body("Payment Failed "  + e.getMessage());
        }
    }
}

