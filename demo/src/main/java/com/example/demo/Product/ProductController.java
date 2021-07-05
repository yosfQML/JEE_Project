package com.example.demo.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping
	public List<Product> getProduct(){
        return productService.getProduct();
	}

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }
    @DeleteMapping(path = "productId")
    public void delProduct(@PathVariable("productId") Long productId){
        productService.delProduct(productId);
    }
}