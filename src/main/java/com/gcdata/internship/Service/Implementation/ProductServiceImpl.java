package com.gcdata.internship.Service.Implementation;

import com.gcdata.internship.Model.Product;
import com.gcdata.internship.Repository.ProductRepository;
import com.gcdata.internship.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(long id, Product newProduct) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(String name) {
        Optional<Product> optional = productRepository.findById(name.toLowerCase(Locale.ROOT));
        if (optional.isPresent()) {
            Product product= optional.get();
            return product;
        }
        else throw  new NoSuchElementException("Product does not exist with this name =" +name);
    }

}
