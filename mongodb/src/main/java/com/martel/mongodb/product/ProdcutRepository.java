package com.martel.mongodb.product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdcutRepository extends MongoRepository<Product, String>{
    
}
