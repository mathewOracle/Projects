package com.example.ecommerce.dto;

import com.example.ecommerce.model.Productor;

public class OrderProductDto {

    private Productor product;
    private Integer quantity;

    public Productor getProduct() {
        return product;
    }

    public void setProduct(Productor product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
