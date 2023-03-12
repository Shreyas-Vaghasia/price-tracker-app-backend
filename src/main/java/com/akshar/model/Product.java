package com.akshar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int productId;
    String productName;

    double productPrice;

    double lastPrice;

    @ManyToOne
    Vendor vendor;

    String moq;
    String packing;
    String ex;
    String paymentTerms;
    String grade;
    @UpdateTimestamp
    LocalDateTime lastUpdated;
    @CreationTimestamp
    LocalDateTime dateCreated;
}
