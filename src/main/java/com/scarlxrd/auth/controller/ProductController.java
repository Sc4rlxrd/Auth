package com.scarlxrd.auth.controller;

import com.scarlxrd.auth.domain.product.Product;
import com.scarlxrd.auth.domain.product.ProductRequestDTO;
import com.scarlxrd.auth.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public ResponseEntity<Product> postProduct(@RequestBody @Validated ProductRequestDTO body){
        Product newProduct = new Product(body);
        this.productRepository.save(newProduct);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
    @GetMapping
    public List<Product> getALl(){
        List<Product> listUser = this.productRepository.findAll();
        return listUser.stream().toList();
    }

}
