package com.falczy.ecommerce.Checkout.resource.checkout;

import lombok.Data;

import java.io.Serializable;

@Data
public class CheckoutRequest implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private String paymentMethod;
    private String cardName;
    private String cardNumber;
    private String cardDate;
    private String cardCvv;
    private Boolean saveAddress;
    private Boolean saveInfo;
}
