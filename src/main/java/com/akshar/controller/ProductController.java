package com.akshar.controller;

import com.akshar.dto.ProductRequest;
import com.akshar.model.Product;
import com.akshar.repository.ProductRepository;
import com.akshar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    public ProductService productService;

    @PostMapping("")
    ResponseEntity<Product> saveProduct(@RequestBody ProductRequest productRequest) {

        Product saveProduct = productService.saveProduct(productRequest);

        return new ResponseEntity<>(saveProduct, HttpStatus.OK);
    }

    @PutMapping("/{productId}")
    ResponseEntity<Product> updateProduct(@RequestBody ProductRequest productRequest,@PathVariable int productId) {

        Product saveProduct = productService.updateProduct(productRequest,productId);

        return new ResponseEntity<>(saveProduct, HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    ResponseEntity<String> deleteProduct(@PathVariable int productId) {

        productService.deleteProduct(productId);

        return new ResponseEntity<>("Deleted product with id " + productId + " successfully", HttpStatus.OK);
    }

    @GetMapping("")
    ResponseEntity<List<Product>> getAllProduct() {

        List<Product> allProduct = productService.getAllProduct();

        return new ResponseEntity<>(allProduct, HttpStatus.OK);
    }

}
