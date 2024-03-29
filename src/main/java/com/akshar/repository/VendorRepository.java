package com.akshar.repository;

import com.akshar.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {
    Optional<Vendor> findByVendorName(String vendorName);


//    public List<Vendor> findVendorByProductName();
}
