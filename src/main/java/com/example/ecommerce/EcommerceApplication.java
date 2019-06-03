package com.example.ecommerce;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.model.OrderProduct;
import com.example.ecommerce.model.Productor;
import com.example.ecommerce.service.OrderProductService;
import com.example.ecommerce.service.OrderService;
import com.example.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService,OrderService orderService,OrderProductService ordProdSer) {
        return args -> {
            productService.save(new Productor(1L, "TV Set", 300.00, "http://placehold.it/200x100"));
            productService.save(new Productor(2L, "Game Console", 200.00, "http://placehold.it/200x100"));
            productService.save(new Productor(3L, "Sofa", 100.00, "http://placehold.it/200x100"));
            productService.save(new Productor(4L, "Icecream", 5.00, "http://placehold.it/200x100"));
            productService.save(new Productor(5L, "Beer", 3.00, "http://placehold.it/200x100"));
            productService.save(new Productor(6L, "Phone", 500.00, "http://placehold.it/200x100"));
            productService.save(new Productor(8L, "Phone", 500.00, "http://placehold.it/200x100"));
            
            Order od=new Order("active");
            Order od2=new Order("pending");
            Productor pd = new Productor(7L, "Watch", 30.00, "http://placehold.it/200x100");
            orderService.create(od);
            orderService.create(od2);
            productService.save(pd);
            ordProdSer.create(new OrderProduct(od,pd,3));
            ordProdSer.create(new OrderProduct(od2,pd,2));
        };
    }
}
