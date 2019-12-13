package com.api.ecommerce.ecommerce.controller;

import com.api.ecommerce.ecommerce.model.Product;
import com.api.ecommerce.ecommerce.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/product")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productServices.getAllProducts();
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable("productId") Long productId) {
        return productServices.getProductById(productId);
    }
}
