package com.example.ecom_proj.service;

import com.example.ecom_proj.model.Product;
import com.example.ecom_proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProduct(){
        return repo.findAll();
    }

    public Optional<Product> getProduct(int id) {
        return repo.findById(id);
    }
}
