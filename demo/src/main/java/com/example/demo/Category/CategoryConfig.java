package com.example.demo.Category;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConfig {

    @Bean
    CommandLineRunner commandLineRunner (CategoryRepository repository){
        return args -> {
            Category phones = new Category(
                1,
                "phones"
            );
            Category tvs = new Category(
                2,
                "tvs"
            );
            repository.saveAll(List.of(phones,tvs));
        };
    }
}
