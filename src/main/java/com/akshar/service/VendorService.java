package com.akshar.service;

import com.akshar.dto.VendorRequest;
import com.akshar.model.Vendor;
import com.akshar.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    @Autowired
    VendorRepository vendorRepository;

    public Vendor saveProduct(VendorRequest vendorRequest) {

        Vendor vendor = new Vendor();
        System.out.println(vendorRequest);
        vendor.setVendorName(vendorRequest.getVendorName());
        vendor.setContactNumber(vendorRequest.getContactNumber());
        vendor.setEmailId(vendorRequest.getEmailId());
        vendor.setProducts(vendorRequest.getProducts());

        return vendorRepository.save(vendor);
    }

    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    public Vendor updateVendor(VendorRequest vendorRequest, int vendorId) {
        Vendor vendor = new Vendor();
        System.out.println(vendorRequest);
        vendor.setVendorId(vendorId);
        vendor.setVendorName(vendorRequest.getVendorName());
        vendor.setContactNumber(vendorRequest.getContactNumber());
        vendor.setEmailId(vendorRequest.getEmailId());
        vendor.setProducts(vendorRequest.getProducts());

        return vendorRepository.save(vendor);
    }

    public void deleteVendor(int vendorId) {

        vendorRepository.deleteById(vendorId);
        return;
    }
}

