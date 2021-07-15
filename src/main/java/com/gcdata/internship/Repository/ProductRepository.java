package com.gcdata.internship.Repository;

import com.gcdata.internship.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
