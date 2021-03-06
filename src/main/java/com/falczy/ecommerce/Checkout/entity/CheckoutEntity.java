package com.falczy.ecommerce.Checkout.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CheckoutEntity {
    @Id
    private Long id;

    @Column
    private String code;
}
