package com.example.ecommerce.service;

import com.example.ecommerce.model.Productor;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Productor> getAllProductors() {
        return productRepository.findAll();
    }

    @Override
    public Productor getProductor(long id) {
        return productRepository
          .findById(id)
          .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public Productor save(Productor product) {
        return productRepository.save(product);
    }
}
