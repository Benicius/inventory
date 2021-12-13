package com.bd.systems.inventory.service;

import com.bd.systems.inventory.domains.Product;
import com.bd.systems.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    private List<Product> findAll(){
        return productRepository.findAll();
    }

    private Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }

    private Product saveProduct(Product product){
        return productRepository.save(product);
    }

    private Product updateProduct(Product product){
        return productRepository.save(product);
    }
}
