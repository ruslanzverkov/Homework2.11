package com.example.homework2_11.Service;

import com.example.homework2_11.Basket.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private final List<Product> products;

    public ProductServiceImpl(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product add(int productID) {
        Product product = new Product(productID);
        products.add(product);
        return product;
    }

    @Override
    public List<Product> get() {
        return products;
    }

}
