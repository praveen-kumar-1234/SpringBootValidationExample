package com.praveen.model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public class Card {

    @NotEmpty
    @Length(min=16,max=16)
    private String cardNumber;


    @NotEmpty
    @Pattern(regexp = "^(0[1-9]|1[0-2])/(\\d{2})$",message = "valid date format is MM/YY")
    private String expiry;

    @NotNull
    @Digits(integer = 3,fraction = 0,message="max 3 digits allowed")
    private Integer cvv;



    @NotEmpty
    @Pattern(regexp = "^([a-zA-Z])+$")
    private String cardHolderName;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
}
