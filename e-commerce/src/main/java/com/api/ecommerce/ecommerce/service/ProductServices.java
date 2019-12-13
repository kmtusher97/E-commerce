package com.api.ecommerce.ecommerce.service;

import com.api.ecommerce.ecommerce.model.Product;
import com.api.ecommerce.ecommerce.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Service
@Transactional
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    /**
     * @return All products
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * @param productId
     * @return Product
     */
    public Product getProductById(Long productId) {
        return productRepository.getOne(productId);
    }

    /**
     * Saves or updates a product
     *
     * @param product
     */
    public void saveOrUpdateProduct(Product product) {
        productRepository.save(product);
    }

    /**
     * Deletes the Product
     *
     * @param productId
     */
    public void deleteProductById(Long productId) {
        productRepository.deleteById(productId);
    }
}
