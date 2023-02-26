package com.akshar.repository;

import com.akshar.model.Product;
import com.akshar.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {


//    public List<Vendor> findVendorByProductName();
}
