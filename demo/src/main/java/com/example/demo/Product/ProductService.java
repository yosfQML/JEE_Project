package com.example.demo.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getProduct(){
		return productRepository.findAll();
	}

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void delProduct(Long productId) {
        boolean exists = productRepository.existsById(productId);
        if (!exists){
            throw new IllegalStateException(
                "product with the id " + productId + " does not exist");
        }
        productRepository.deleteById(productId);
    }
}
