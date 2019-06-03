package com.example.ecommerce.service;

import com.example.ecommerce.model.Productor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
public interface ProductService {

    @NotNull Iterable<Productor> getAllProductors();

    Productor getProductor(@Min(value = 1L, message = "Invalid product ID.") long id);

    Productor save(Productor product);
}
