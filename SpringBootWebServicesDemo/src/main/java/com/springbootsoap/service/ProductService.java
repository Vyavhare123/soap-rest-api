package com.springbootsoap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsoap.model.Product1;
import com.springbootsoap.repository.ProductRepository;

import springbootsoap.com.products.Product;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product1> getAllProducts() {
        return productRepository.findAll();
    }

    public Product1 getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product1 saveProduct(Product1 product1) {
        return productRepository.save(product1);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}