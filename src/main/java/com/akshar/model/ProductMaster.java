package com.akshar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int pid;

    String productName;

    public ProductMaster(int pid, String productName) {
        this.pid = pid;
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

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "ProductMaster{" +
                "id=" + pid +
                ", productName='" + productName + '\'' +
                '}';
    }
}
