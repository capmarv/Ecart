package com.shopping.Ecart.Service;

import com.shopping.Ecart.Model.Product;
import com.shopping.Ecart.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
    public ProductRepo getRepo() {
        return repo;
    }

    public void setRepo(ProductRepo repo) {
        this.repo = repo;
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }
}
