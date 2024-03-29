package com.akshar.service;

import com.akshar.dto.ProductRequest;
import com.akshar.model.Product;
import com.akshar.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product saveProduct(ProductRequest productRequest) {
        Product product = new Product();

        product.setProductName(productRequest.getProductName());
        product.setProductPrice(productRequest.getProductPrice());

        return productRepository.save(product);
    }

    public List<Product> getAllProduct() {

        return productRepository.findAllProducts();
    }

    public void deleteProduct(int productId) {

        productRepository.deleteById(productId);
    }

    public Product updateProduct(ProductRequest productRequest, int productId) {
        Product product = productRepository.findById(productId).get();
        product.setProductId(productId);
//        product.setProductName(productRequest.getProductName());
        product.setProductPrice(productRequest.getProductPrice());

        product.setMoq(productRequest.getMoq());
        product.setEx(productRequest.getEx());
        product.setGrade(productRequest.getGrade());
        product.setPacking(productRequest.getPacking());
        product.setPaymentTerms(productRequest.getPaymentTerms());
        product.setLastPrice(productRequest.getLastPrice());

        return productRepository.save(product);
    }

    public Product getProductById(int productId) {
        return productRepository.findById(productId).orElse(null);
    }
}
