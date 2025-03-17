package com.scaler.todoproject.DTO;

import com.stripe.model.Charge;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL) // Exclude null values
public class ChargeDTO {
    @JsonProperty("id")  // Explicitly mapping field names
    private String id;
    @JsonProperty("amount")
    private long amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("status")
    private String status;

    public ChargeDTO(Charge charge) {
        this.id = charge.getId();
        this.amount = charge.getAmount();
        this.currency = charge.getCurrency();
        this.status = charge.getStatus();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
