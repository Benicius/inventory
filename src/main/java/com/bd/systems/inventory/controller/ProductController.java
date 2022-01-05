package com.bd.systems.inventory.controller;

import com.bd.systems.inventory.domains.Product;
import com.bd.systems.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public ResponseEntity<List<Product>> findAll(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }
}
