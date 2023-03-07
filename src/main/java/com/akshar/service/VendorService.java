package com.akshar.service;

import com.akshar.dto.VendorRequest;
import com.akshar.model.Product;
import com.akshar.model.Vendor;
import com.akshar.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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
//        System.out.println(vendorId);

//        Vendor vendor = new Vendor();
//        System.out.println(vendorRequest);
//        vendor.setVendorId(vendorId);
//        vendor.setVendorName(vendorRequest.getVendorName());
//        vendor.setContactNumber(vendorRequest.getContactNumber());
//        vendor.setEmailId(vendorRequest.getEmailId());
//        vendor.setProducts(vendorRequest.getProducts());

        if (vendorRepository.findById(vendorId).isPresent()) {
//
            Vendor vendor1 = vendorRepository.findById(vendorId).get();
            //update only name/contact/email
            if (vendorRequest.getVendorName() != null && vendorRequest.getContactNumber() != null && vendorRequest.getEmailId() != null) {
                vendor1.setVendorName(vendorRequest.getVendorName());
                vendor1.setContactNumber(vendorRequest.getContactNumber());
                vendor1.setEmailId(vendorRequest.getEmailId());
//                System.out.println("inside if ");
                return vendorRepository.save(vendor1);

            }
//            if (vendorRequest.getContactNumber() != null) {
//                vendor1.setContactNumber(vendorRequest.getContactNumber());
//            }
//            if (vendorRequest.getEmailId() != null) {
//                vendor1.setEmailId(vendorRequest.getEmailId());
//            }
//            vendor1.setVendorName(vendorRequest.getVendorName());
//            vendor1.setContactNumber(vendorRequest.getContactNumber());
//            vendor1.setEmailId(vendorRequest.getEmailId());

            //Add more products into the existing Set for vendor
            Set<Product> oldProducts = vendor1.getProducts();
            oldProducts.addAll(vendorRequest.getProducts());
            vendor1.setProducts(oldProducts);
            return vendorRepository.save(vendor1);
        }
        return null;
    }

    public void deleteVendor(int vendorId) {

        vendorRepository.deleteById(vendorId);
        return;
    }
}

