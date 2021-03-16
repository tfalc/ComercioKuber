package com.falczy.ecommerce.Checkout.service;

import com.falczy.ecommerce.Checkout.entity.CheckoutEntity;
import com.falczy.ecommerce.Checkout.resource.checkout.CheckoutRequest;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest);
}
