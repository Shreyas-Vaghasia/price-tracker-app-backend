package com.akshar.exception;

public class DuplicateVendorNameException extends RuntimeException {
    public DuplicateVendorNameException(String vendorAlreadyExists) {
        super(vendorAlreadyExists);
    }
}
