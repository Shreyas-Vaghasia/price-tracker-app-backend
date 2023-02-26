package com.akshar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String productName;

    public ProductMaster(String productName) {
        this.productName = productName;
    }

    public ProductMaster() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
