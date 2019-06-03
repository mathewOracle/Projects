package com.example.ecommerce.repository;

import com.example.ecommerce.model.Productor;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Productor, Long> {
}
