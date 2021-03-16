package com.falczy.ecommerce.Checkout.service;

import com.falczy.ecommerce.Checkout.entity.CheckoutEntity;
import com.falczy.ecommerce.Checkout.repository.CheckoutRepository;
import com.falczy.ecommerce.Checkout.resource.checkout.CheckoutRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CheckoutServiceImp implements CheckoutService{

    public final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest){
        return Optional.empty();
    }
}
