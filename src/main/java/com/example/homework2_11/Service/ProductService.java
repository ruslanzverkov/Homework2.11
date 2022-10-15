package com.example.homework2_11.Service;

import com.example.homework2_11.Basket.Product;

import java.util.List;

public interface ProductService {
    Product add(int productID);

    List<Product> get();
}
