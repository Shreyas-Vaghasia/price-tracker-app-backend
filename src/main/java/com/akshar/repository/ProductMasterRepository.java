package com.akshar.repository;

import com.akshar.model.Product;
import com.akshar.model.ProductMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMasterRepository extends JpaRepository<ProductMaster, Integer> {

}
