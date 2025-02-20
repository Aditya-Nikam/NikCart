package com.example.ecom_proj.repository;

import com.example.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
