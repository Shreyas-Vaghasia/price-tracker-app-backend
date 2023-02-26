package com.akshar.controller;

import com.akshar.dto.VendorRequest;
import com.akshar.model.Vendor;
import com.akshar.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/vendor")
public class VendorController {
    @Autowired
    public VendorService vendorService;

    @PostMapping("")
    ResponseEntity<Vendor> saveVendor(@RequestBody VendorRequest vendorRequest) {

        Vendor savedVendor = vendorService.saveProduct(vendorRequest);

        return new ResponseEntity<>(savedVendor, HttpStatus.OK);
    }

    @GetMapping("")
    ResponseEntity<List<Vendor>> getAllVendsors() {

        List<Vendor> savedVendor = vendorService.getAllVendors();

        return new ResponseEntity<>(savedVendor, HttpStatus.OK);
    }

    @PutMapping("/{vendorId}")
    ResponseEntity<Vendor> updateVendor(@RequestBody VendorRequest vendorRequest, @PathVariable int vendorId) {

        Vendor savedVendor = vendorService.updateVendor(vendorRequest,vendorId);

        return new ResponseEntity<>(savedVendor, HttpStatus.OK);
    }

}
