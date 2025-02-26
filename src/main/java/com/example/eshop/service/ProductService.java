package com.example.eshop.service;

import com.example.eshop.model.Product;
import com.example.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Получить все товары
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Добавить новый товар
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Удалить товар по ID
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}