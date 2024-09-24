package com.martel.mongodb.product;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProdcutRepository repository;

    public String save(Product product) {
        return repository.save(product).getId();
    }

    public Product findById(String id) {
        return repository.findById(id).orElse(null);
    } 

    public List<Product> findAll() {
        return repository.findAll();
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
