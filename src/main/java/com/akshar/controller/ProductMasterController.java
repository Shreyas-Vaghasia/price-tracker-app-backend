package com.akshar.controller;

import com.akshar.dto.ProductMasterRequest;
import com.akshar.dto.ProductRequest;
import com.akshar.model.Product;
import com.akshar.model.ProductMaster;
import com.akshar.repository.ProductMasterRepository;
import com.akshar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/product-master")
public class ProductMasterController {
    @Autowired
    public ProductMasterRepository productMasterRepository;

    @PostMapping("")
    ResponseEntity<ProductMaster> saveProduct(@RequestBody ProductMaster productMaster) {

        ProductMaster save = productMasterRepository.save(productMaster);
        return new ResponseEntity<>(save, HttpStatus.OK);
    }

    @GetMapping("")
    ResponseEntity<List<ProductMaster>> getAllProduct() {

        List<ProductMaster> allProduct = productMasterRepository.findAll();
        return new ResponseEntity<>(allProduct, HttpStatus.OK);
    }


}
