package com.example.ecom_proj.service;

import com.example.ecom_proj.model.Product;
import com.example.ecom_proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());

        return repo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
       if(repo.findById(id).isPresent()) {
           product.setImageName(imageFile.getOriginalFilename());
           product.setImageType(imageFile.getContentType());
           product.setImageData(imageFile.getBytes());
           return repo.save(product);
       }
       return null;
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
