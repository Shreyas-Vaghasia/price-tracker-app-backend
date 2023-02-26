package com.akshar.dto;

public class ProductMasterRequest {

    String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductMasterRequest(String productName) {
        this.productName = productName;
    }

    public ProductMasterRequest() {
    }
}
