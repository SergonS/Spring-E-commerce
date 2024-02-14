package com.sergon.eshop.repository;

import com.sergon.eshop.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>
{
}
