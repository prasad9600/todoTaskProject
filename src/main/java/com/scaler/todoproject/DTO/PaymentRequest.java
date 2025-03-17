package com.scaler.todoproject.DTO;


import lombok.Data;

@Data
public class PaymentRequest {
    private String currency;
    private Long amount;  // Amount in cents (Stripe uses smallest currency units)
    private String token; // Stripe token (generated from frontend)

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}


