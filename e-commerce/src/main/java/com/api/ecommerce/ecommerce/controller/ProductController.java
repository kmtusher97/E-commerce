package com.api.ecommerce.ecommerce.controller;

import com.api.ecommerce.ecommerce.model.Product;
import com.api.ecommerce.ecommerce.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/product")
public class ProductController {

    @Autowired
    private ProductServices productServices;


    /**
     * @return
     */
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productServices.getAllProducts();
    }

    /**
     * @param productId
     * @return
     */
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long productId) {
        return productServices.getProductById(productId);
    }

    /**
     * @param product
     * @return
     */
    @PostMapping("/add")
    public Product addNewProduct(@RequestBody Product product) {
        return productServices.saveOrUpdateProduct(product);
    }
}
