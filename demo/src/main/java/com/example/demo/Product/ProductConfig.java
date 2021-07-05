package com.example.demo.Product;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner (ProductRepository repository){
        return args -> {
            Product phone = new Product(
                "S8",
                "description1",
                "shortDescription1",
                5,
                10000
            );
            Product tv = new Product(
                "Samsung",
                "description2",
                "shortDescription2",
                2,
                2000
            );
            repository.saveAll(List.of(phone,tv));
        };
    }
}
